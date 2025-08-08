import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nNotes Manager");
            System.out.println("1. View Notes");
            System.out.println("2. Add Note");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    readNotes();
                    break;
                case "2":
                    System.out.print("Enter your note: ");
                    String note = scanner.nextLine();
                    writeNote(note);
                    break;
                case "3":
                    System.out.println("Exiting..");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void readNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            System.out.println("\n--- Your Notes ---");
            String line;
            boolean hasContent = false;
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
                hasContent = true;
            }
            if (!hasContent) {
                System.out.println("No notes found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found (file does not exist).");
        } catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }

    private static void writeNote(String note) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { // Append mode
            writer.write(note + System.lineSeparator());
            System.out.println("Note added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing note: " + e.getMessage());
        }
    }
}
