import java.util.ArrayList;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> redoHistory; // Redo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento currentState = model.createMemento();
            redoHistory.add(currentState); // Add to redo history
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Memento found in redo history");
            IMemento currentState = model.createMemento();
            history.add(currentState); // Add to history
            IMemento nextState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
        redoHistory.clear();
    }

    public void openHistoryWindow() {
        Stage historyStage = new Stage();
        historyStage.setTitle("History");

        ListView<IMemento> listView = new ListView<>();
        listView.getItems().addAll(history);

        listView.setOnMouseClicked(event -> {
            IMemento selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                IMemento currentState = model.createMemento();
                redoHistory.add(currentState); // support undo after clicking
                model.restoreState(selected);
                gui.updateGui();
            }
        });

        VBox layout = new VBox(listView);
        Scene scene = new Scene(layout, 300, 400);
        historyStage.setScene(scene);
        historyStage.show();
    }
}