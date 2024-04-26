import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input bilangan bulat dari pengguna
        System.out.print("Masukkan bilangan bulat: ");
        int number = scanner.nextInt();

        // Memeriksa apakah bilangan tersebut ganjil atau genap
        if (number % 2 == 0) {
            System.out.println(number + " adalah bilangan genap.");
        } else {
            System.out.println(number + " adalah bilangan ganjil.");
        }

        scanner.close();
    }
}
