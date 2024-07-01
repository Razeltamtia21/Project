/*
Razel Michelle Dude Nagara
Absen 29
*/
import java.util.Scanner;
public class soal4_razel_29{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai uang Dollar ke nilai Rupiah: ");
        int uang = input.nextInt();

        System.out.println("Jumlah hasil $" + uang + " ke Rupiah adalah: Rp." + (16000*uang));
    }
}