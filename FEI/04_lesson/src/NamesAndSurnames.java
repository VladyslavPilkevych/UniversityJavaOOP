import java.util.ArrayList;
import java.util.Scanner;

public class NamesAndSurnames {
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<String> surnames = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void initializeData() {
        names.add("Alice"); surnames.add("Johnson");
        names.add("Bob"); surnames.add("Smith");
        names.add("Charlie"); surnames.add("Brown");
        names.add("David"); surnames.add("Taylor");
        names.add("Eve"); surnames.add("Anderson");
        names.add("Frank"); surnames.add("Thomas");
        names.add("Grace"); surnames.add("Jackson");
        names.add("Hannah"); surnames.add("White");
        names.add("Ivy"); surnames.add("Harris");
        names.add("Jake"); surnames.add("Martin");
    }

    public static void addEntry() {
        System.out.println("Enter the first name:");
        String name = scanner.nextLine();
        System.out.println("Enter the surname:");
        String surname = scanner.nextLine();

        names.add(name);
        surnames.add(surname);

        System.out.println("Entry added: " + name + " " + surname);
    }

    public static void deleteEntry() {
        System.out.println("Enter the name of the person to delete:");
        String nameToDelete = scanner.nextLine();

        int index = names.indexOf(nameToDelete);

        if (index != -1) {
            names.remove(index);
            surnames.remove(index);
            System.out.println("Entry deleted: " + nameToDelete);
        } else {
            System.out.println("User not found.");
        }
    }

    public static void searchEntry() {
        System.out.println("Enter the name to search for:");
        String nameToSearch = scanner.nextLine();

        int index = names.indexOf(nameToSearch);

        if (index != -1) {
            System.out.println("User found: " + nameToSearch + " " + surnames.get(index));
        } else {
            System.out.println("User not found.");
        }
    }

    public static void displayList() {
        System.out.println("Names and Surnames List:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " " + surnames.get(i));
        }
    }

    public static void main(String[] args) {
        initializeData();
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Add a new entry");
            System.out.println("2 - Delete an entry");
            System.out.println("3 - Search for an entry");
            System.out.println("4 - Display the list");
            System.out.println("5 - Exit to main menu");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    deleteEntry();
                    break;
                case 3:
                    searchEntry();
                    break;
                case 4:
                    displayList();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
