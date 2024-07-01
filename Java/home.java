import java.util.Scanner;
public class home {
    public static void main(String[] args) {
        int alas, tinggi, luas;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Menghitung Luas segitiga");
            System.out.print("Masukan alas \t\t: ");
            alas = input.nextInt();
            System.out.print("Masukan tinggi \t\t: ");
            tinggi = input.nextInt();
        }

        luas = alas * tinggi / 2;
        System.out.println("\n jadi luas Segitiga adalah " + luas + "cm");


        
    }
    
}
