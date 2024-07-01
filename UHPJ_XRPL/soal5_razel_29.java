/*
Razel Michelle Dude Nagara
Absen 29
*/
import java.util.Scanner;
public class soal5_razel_29{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int jumlah = input.nextInt();

        int[] array = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Array awal: ");
        tampilkanArray(array);

        boolean lanjutkan = true;
        boolean selesai = false;
        while (!selesai) {
            System.out.print("Masukkan urutan elemen yang ingin diganti (1 - " + jumlah + "): ");
            int urutan = input.nextInt();

            System.out.print("Masukkan nilai baru untuk elemen ke-" + urutan + ": ");
            int nilaiBaru = input.nextInt();

            array[urutan - 1] = nilaiBaru;

            System.out.println("Array setelah penggantian: ");
            tampilkanArray(array);

            System.out.print("Apakah Anda ingin mengganti elemen lain? (ya/tidak): ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                selesai = true;
            }else if(jawaban.equalsIgnoreCase("ya")){
                lanjutkan = true;
            }
        }
        System.out.println("Array akhir: ");
        tampilkanArray(array);

        input.close();
    }
    public static void tampilkanArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
