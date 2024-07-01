
import java.util.Scanner;
public class index {

    public static void main(String[] args) {
        String nama, kelas, tahun;

        Scanner dataScanner = new Scanner(System.in);


        System.out.println(" =========== Perkenalkan diri ========== ");
        System.out.print("Masukan nama anda \t: ");
        nama = dataScanner.nextLine();

        System.out.print("Masukan kelas anda \t: ");
        kelas = dataScanner.nextLine();

        System.out.print("tahun lahir anda  \t: ");
        tahun = dataScanner.nextLine();

        System.out.println(" ============ Data diri anda ============= ");
        System.out.print("|| Nama \t\t\t:" + nama + "\t||\n");
        System.out.print("|| Kelas \t\t\t:" + kelas + "\t||\n");
        System.out.print("|| Tahun \t\t\t:" + tahun + "\t||\n");

        dataScanner.close();
    }
}