import java.util.Scanner;
public class main{
    public static void main(String[] args){
        String nama,kelas;
        int tahun, umur;
        Scanner dataScanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.err.println("MASUKAN NAMA \t:");
        nama = dataScanner.nextLine();
        System.err.println("MASUKAN KELAS \ta:");
        kelas = dataScanner.nextLine();
        System.err.println("MASUKAN TAHUN \t:");
        tahun = input.nextInt();

        umur = (2024-tahun);

        System.out.println("==========================================================");
        System.out.println("             KARTU DATA SISWA SMK BAKTI IDHATA");
        System.out.println("==========================================================");
        System.out.println("NAMA ANDA \t: " + nama);
        System.out.println("KELAS ANDA \t: " + kelas);
        System.out.println("UMUR ANDA \t: " + umur);
        System.out.println("==========================================================");
    }
}