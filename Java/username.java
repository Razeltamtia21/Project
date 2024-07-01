import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class username {
    static Map<String, String> credentials = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Buat Akun");
            System.out.println("2. Login");
            System.out.println("3. Lupa Password");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    forgotPassword(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void createAccount(Scanner scanner) {
        System.out.print("Masukkan nama pengguna: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String password = scanner.nextLine();
        credentials.put(username, password);
        System.out.println("Akun berhasil dibuat.");
    }

    static void login(Scanner scanner) {
        System.out.print("Masukkan nama pengguna: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String password = scanner.nextLine();
        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            System.out.println("Login berhasil.");
        } else {
            System.out.println("Nama pengguna atau kata sandi salah.");
        }
    }

    static void forgotPassword(Scanner scanner) {
        System.out.print("Masukkan nama pengguna: ");
        String username = scanner.nextLine();
        if (credentials.containsKey(username)) {
            System.out.print("Masukkan kata sandi baru: ");
            String newPassword = scanner.nextLine();
            credentials.put(username, newPassword);
            System.out.println("Kata sandi berhasil diubah.");
        } else {
            System.out.println("Akun dengan nama pengguna tersebut tidak ditemukan.");
        }
    }
}
