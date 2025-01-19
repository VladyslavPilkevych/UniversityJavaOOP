import java.util.ArrayList;
import java.util.Scanner;

public class UserDetails {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeData();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Add New User");
            System.out.println("2 - Update User Details");
            System.out.println("3 - Remove User");
            System.out.println("4 - Display All Users");
            System.out.println("5 - Exit to Main Menu");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    updateUser();
                    break;
                case 3:
                    removeUser();
                    break;
                case 4:
                    displayUsers();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeData() {
        users.add(new User("Alice", 25, "Smith", "2022-01-15", "1234567890", "alice@example.com", "USA"));
        users.add(new User("Bob", 30, "Johnson", "2022-02-20", "0987654321", "bob@example.com", "Canada"));
    }

    private static void addUser() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter registration date:");
        String regDate = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter country:");
        String country = scanner.nextLine();

        User newUser = new User(name, age, surname, regDate, phone, email, country);
        users.add(newUser);
        System.out.println("New user added successfully!");
    }

    private static void updateUser() {
        System.out.println("Enter index of the user to update:");
        int index = Integer.parseInt(scanner.nextLine());

        if (index >= 0 && index < users.size()) {
            System.out.println("Enter new name for user:");
            String newName = scanner.nextLine();
            users.get(index).setName(newName);
            System.out.println("User updated successfully!");
        } else {
            System.out.println("Invalid user index.");
        }
    }

    private static void removeUser() {
        System.out.println("Enter index of the user to remove:");
        int index = Integer.parseInt(scanner.nextLine());

        if (index >= 0 && index < users.size()) {
            users.remove(index);
            System.out.println("User removed successfully!");
        } else {
            System.out.println("Invalid user index.");
        }
    }

    private static void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users to display.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
