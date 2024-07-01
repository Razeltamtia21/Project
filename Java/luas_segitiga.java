import java.util.Scanner;
//Razel Michelle Dude Nagara
public class luas_segitiga{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Alas: ");
        int alas = input.nextInt();

        System.out.print("Masukkan Tinggi: ");
        int tinggi = input.nextInt();

        System.out.println("Luas segitiga adalah: " + (alas * tinggi / 2) + " cm");
    }
}