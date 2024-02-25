import java.util.Scanner;

public class hari{

    public static void main(String[] args){

        String nama, kelas;
        int tahun, usia;

        // Scanner input = new Scanner(System.in);

        try (Scanner Inputuser = new Scanner(System.in)){

        System.out.print("Masukan nama \t: ");
        nama = Inputuser.nextLine();
        
        System.out.print("Masukan Kelas \t: ");
        kelas = Inputuser.nextLine();


        System.out.print("Tahun Lahir \t: ");
        tahun = Inputuser.nextInt();

        usia = 2024-tahun;

        System.out.println(" =========== Perkenalkan diri ========== ");
        System.out.println("Nama \t: " + nama + "\n");
        System.out.println("Kelas \t: " + kelas + "\n");
        System.out.println("Usia \t: " + usia + "\n");
        }catch (Exception e){
            System.out.println("Error :" + e);
        }
     }
}