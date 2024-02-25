import java.util.Scanner;
public class bruh {
    public static void main(String[] args) {
        String nama, kelas;
        int tahun;
        
        try (Scanner dataScanner = new Scanner(System.in)) {
            System.out.println("SELAMAT DATANG");
            System.out.print("masukan nama \t\t:");
            nama = dataScanner.nextLine();
            System.out.print("masukan kelas \t\t:");
            kelas = dataScanner.nextLine();
            System.out.print("masukan tahun \t\t:");
            tahun = dataScanner.nextInt();

            tahun= 2024-tahun;
        }


        System.out.print("Selamat datang " + nama + ", kamu sekarang berada dikelas " + kelas + " usia anda " + tahun );

    }
    
}
