//Razel Michelle Dude Nagara
//Absen 29
import java.util.Scanner;
public class soal2_razel_29{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = input.nextInt();
        System.out.println();
        System.out.print("Masukkan nilai perdua: ");
        int nilai2 = input.nextInt();
        System.out.println();
        System.out.print("Masukkan nilai pertiga: ");
        int nilai3 = input.nextInt();

        System.out.println("Hasil dari " + nilai1 + " x " + nilai2 + " / " + nilai3 + " adalah: " + (nilai1*nilai2/nilai3));
    }
}