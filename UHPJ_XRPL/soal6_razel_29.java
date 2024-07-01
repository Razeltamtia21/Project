/*
Razel Michelle Dude Nagara
Absen 29
*/
import java.util.Scanner;
public class soal6_razel_29{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pemesanan kopi arabika(per cup Rp.15000): ");
        int kopi = input.nextInt();

        System.out.println("Jumlah pesan " + kopi + " kopi arabika dengan harga total: Rp." + (15000 * kopi));
    }
}