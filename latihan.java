import java.util.Scanner;
public class latihan {
    public static void main(String[] args){
        String nama, kelas;
        int umur;
        Scanner Inputuser = new Scanner(System.in);
        System.out.print("\nNAMA ANDA \t: ");
        nama = Inputuser.nextLine();
        System.out.print("\nKELAS ANDA \t: ");
        kelas = Inputuser.nextLine();
        System.out.print("\nUSIA ANDA \t: ");
        umur = Inputuser.nextInt();
    }
}
