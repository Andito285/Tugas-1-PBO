import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LibrarySystem {
    private Map<String, String> studentMap;
    private Map<String, String> adminMap;
    private Scanner scanner;

    public LibrarySystem() {
        studentMap = new HashMap<>();
        studentMap.put("202310370311285", "Student1");

        adminMap = new HashMap<>();
        adminMap.put("admin", "adm1n");
    }

    public void start() {
        scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("===== Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.println("Choose option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginAsStudent();
                    break;
                case 2:
                    loginAsAdmin();
                    break;
                case 3:
                    exit = true;
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("=====");
        }
    }

    private void loginAsStudent() {
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();

        if (studentMap.containsKey(nim)) {
            System.out.println("Successful Login as Student");
            // Perform student actions here
        } else {
            System.out.println("User Not Found");
        }
        System.out.println("=====");
    }

    private void loginAsAdmin() {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();

        if (adminMap.containsKey(username)) {
            System.out.print("Enter your password (admin): ");
            String password = scanner.next();

            if (adminMap.get(username).equals(password)) {
                System.out.println("Successful Login as Admin");
                // Perform admin actions here
            } else {
                System.out.println("Admin User Not Found!!");
            }
        } else {
            System.out.println("Admin User Not Found!!");
        }
        System.out.println("=====");
    }
}

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}