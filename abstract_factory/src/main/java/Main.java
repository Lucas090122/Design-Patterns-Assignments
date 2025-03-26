public class Main {
    public static void main(String[] args) {
        UIFactory factoryA = new AFactory();
        Button buttonA = factoryA.createButton("OK");
        TextField textFieldA = factoryA.createTextField("Enter your name");
        Checkbox checkboxA = factoryA.createCheckbox("Accept terms");

        System.out.println("UI components created by AFactory:");
        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        buttonA.setText("Cancel");
        textFieldA.setText("John Doe");
        checkboxA.setText("I accept the terms");

        System.out.println("\nUI components created by AFactory after setting text:");
        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        UIFactory factoryB = new BFactory();
        Button buttonB = factoryB.createButton("OK");
        TextField textFieldB = factoryB.createTextField("Enter your name");
        Checkbox checkboxB = factoryB.createCheckbox("Accept terms");

        System.out.println("\nUI components created by BFactory:");
        buttonB.display();
        textFieldB.display();
        checkboxB.display();

        buttonB.setText("Cancel");
        textFieldB.setText("John Doe");
        checkboxB.setText("I accept the terms");

        System.out.println("\nUI components created by BFactory after setting text:");
        buttonB.display();
        textFieldB.display();
        checkboxB.display();
    }
}
