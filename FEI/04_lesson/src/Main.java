import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a task:");
            System.out.println("1 - Manage Names and Surnames");
            System.out.println("2 - Manage User Details");
            System.out.println("3 - Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Managing Names and Surnames...");
                    NamesAndSurnames.main(args);
                    break;

                case 2:
                    System.out.println("Managing User Details...");
                    UserDetails.main(args);
                    break;

                case 3:
                    System.out.println("End.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}