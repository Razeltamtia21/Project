import java.util.HashMap;
import java.util.Scanner;

class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}

public class AccountManager {
    private HashMap<String, UserAccount> accounts = new HashMap<>();

    public boolean createAccount(String username, String password) {
        if (accounts.containsKey(username)) {
            return false; // Username already exists
        }
        accounts.put(username, new UserAccount(username, password));
        return true;
    }

    public boolean loginAccount(String username, String password) {
        UserAccount account = accounts.get(username);
        if (account != null && account.checkPassword(password)) {
            return true; // Login successful
        }
        return false; // Login failed
    }

    public UserAccount searchAccount(String username) {
        return accounts.get(username);
    }

    public boolean deleteAccount(String username) {
        if (accounts.containsKey(username)) {
            accounts.remove(username);
            return true; // Account deleted
        }
        return false; // Account not found
    }

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAccount Manager");
            System.out.println("1. Create Account");
            System.out.println("2. Login Account");
            System.out.println("3. Search Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter username: ");
                    String createUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String createPassword = scanner.nextLine();
                    if (manager.createAccount(createUsername, createPassword)) {
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Username already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    if (manager.loginAccount(loginUsername, loginPassword)) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 3:
                    System.out.print("Enter username to search: ");
                    String searchUsername = scanner.nextLine();
                    UserAccount foundAccount = manager.searchAccount(searchUsername);
                    if (foundAccount != null) {
                        System.out.println("Account found: " + foundAccount.getUsername());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter username to delete: ");
                    String deleteUsername = scanner.nextLine();
                    if (manager.deleteAccount(deleteUsername)) {
                        System.out.println("Account deleted successfully.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
