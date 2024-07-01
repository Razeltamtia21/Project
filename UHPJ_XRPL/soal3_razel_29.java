/*
Razel Michelle Dude Nagara
Absen 29
*/
import java.util.Scanner;
public class soal3_razel_29{
    //mencari luas trapesium
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();
        System.out.print("\nMasukkan atas: ");
        double atas = input.nextDouble();
        System.out.print("\nMasukkan tinggi: ");
        double tinggi = input.nextDouble();

        System.out.println("Hasil pencarian luas trapesium adalah: " + (0.5 * (alas+atas) * tinggi));
    }
}