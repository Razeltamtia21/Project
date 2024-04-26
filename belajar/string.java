import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Konversi string ke huruf kecil.");
            System.out.println("2. Hitung jumlah kemunculan suatu karakter.");
            System.out.println("3. Balik string.");
            System.out.println("4. Keluar.");
            System.out.print("\nPilih menu (1/2/3/4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membuang newline dari buffer

            switch (choice) {
                case 1:
                    System.out.println("String setelah dikonversi ke huruf kecil: " + toLowerCase(input));
                    break;
                case 2:
                    System.out.print("Masukkan karakter yang ingin dihitung: ");
                    char ch = scanner.nextLine().charAt(0);
                    System.out.println("Jumlah kemunculan karakter '" + ch + "' dalam string adalah " + countOccurrences(input, ch));
                    break;
                case 3:
                    System.out.println("String setelah dibalik: " + reverseString(input));
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
