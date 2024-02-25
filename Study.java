import java.util.Scanner;

public class Study {

    public static void main(String[] args) {
       int panjang, lebar, luas;

       Scanner input = new Scanner(System.in);


       System.out.println("Menghitung persegi panjang");
       System.out.print("Masukan panjang \t: ");
       panjang = input.nextInt();
       System.out.print("Masukan lebar \t\t: ");
       lebar = input.nextInt();
       luas = panjang * lebar;

       System.out.println("\n Jadi luas persegi panjang adalah " + luas + "cm");
       input.close();


    }
}