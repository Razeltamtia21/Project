import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Penjumlahan");
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();
        
        int hasil = bilangan1 + bilangan2;
        System.out.println("Hasil penjumlahan: " + hasil);
        
        scanner.close();
    }
}
