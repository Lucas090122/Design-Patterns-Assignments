import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Recommendation> recommendationMap = new HashMap<>();

        Recommendation studentRec = new Recommendation("High School Students");
        studentRec.addBook(new Book("Orwell", "1984", "Dystopian", 1949));
        studentRec.addBook(new Book("Salinger", "The Catcher in the Rye", "Fiction", 1951));
        recommendationMap.put("StudentList", studentRec);

        while (true) {
            System.out.println("\n--- Book Recommendation System ---");
            System.out.println("1. View all recommendations");
            System.out.println("2. Clone and modify a recommendation");
            System.out.println("3. Add a new recommendation from scratch");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    for (String name : recommendationMap.keySet()) {
                        System.out.println("[" + name + "]");
                        System.out.println(recommendationMap.get(name));
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.print("Enter existing recommendation name: ");
                    String name = scanner.nextLine();
                    Recommendation original = recommendationMap.get(name);
                    if (original == null) {
                        System.out.println("Recommendation not found.");
                        continue;
                    }
                    Recommendation cloned = original.clone();
                    System.out.print("New name for cloned recommendation: ");
                    String newName = scanner.nextLine();
                    System.out.print("New target audience (optional): ");
                    String newAudience = scanner.nextLine();
                    if (!newAudience.isBlank()) cloned.setTargetAudience(newAudience);

                    System.out.println("Add a new book? (yes/no)");
                    while (scanner.nextLine().equalsIgnoreCase("yes")) {
                        System.out.print("Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Genre: ");
                        String genre = scanner.nextLine();
                        System.out.print("Year: ");
                        int year = Integer.parseInt(scanner.nextLine());
                        cloned.addBook(new Book(author, title, genre, year));
                        System.out.println("Add another book? (yes/no)");
                    }

                    recommendationMap.put(newName, cloned);
                    System.out.println("Cloned and saved as " + newName);
                }
                case 3 -> {
                    System.out.print("Enter new recommendation name: ");
                    String name = scanner.nextLine();
                    System.out.print("Target audience: ");
                    String audience = scanner.nextLine();
                    Recommendation newRec = new Recommendation(audience);

                    System.out.println("Add a new book? (yes/no)");
                    while (scanner.nextLine().equalsIgnoreCase("yes")) {
                        System.out.print("Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Genre: ");
                        String genre = scanner.nextLine();
                        System.out.print("Year: ");
                        int year = Integer.parseInt(scanner.nextLine());
                        newRec.addBook(new Book(author, title, genre, year));
                        System.out.println("Add another book? (yes/no)");
                    }

                    recommendationMap.put(name, newRec);
                    System.out.println("Saved recommendation: " + name);
                }
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
            }
        }
    }
}
