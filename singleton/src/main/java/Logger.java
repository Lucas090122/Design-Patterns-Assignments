import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private String fileName;

    private Logger() {
        setFileName("default_log.txt");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        close();
        this.fileName = fileName;
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.out.println("Failed to set file name: " + e.getMessage());
        }
    }

    public void write(String message) {
        try {
            if (writer != null) {
                writer.write(message);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Failed to write log: " + e.getMessage());
        }
    }

    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Failed to close writer: " + e.getMessage());
        }
    }
}
