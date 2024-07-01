import java.util.Scanner;
//Razel Michelle Dude Nagara
public class parkiran{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n    PROGRAM PARKIRAN SEDERHANA");
        System.out.println("\n[1] Motor");
        System.out.println("[2] Mobil");

        System.out.print("\nPililah jenis kendaraan anda: ");
        int kendaraan = input.nextInt();

        System.out.print("\nMasukkan lama parkir(perjam): ");
        int parkir = input.nextInt();

        if(kendaraan == 1){
            System.out.println("\n  HASIL TARIF PARKIR KENDARAAN ANDA");
            System.out.println("\nJenis kendaraan anda      : Motor");
            System.out.println("Biaya parkir (perjam)     : Rp.2000-");
            System.out.println("Lama pakir anda adalah    : " + parkir + " Jam");
            System.out.println("Total parkir anda adalah  : " + " Rp." + (2000*parkir) + "-");
        }
        else if(kendaraan == 2){
            System.out.println("\n  HASIL TARIF PARKIR KENDARAAN ANDA");
            System.out.println("\nJenis kendaraan anda      : Mobil");
            System.out.println("Biaya parkir (perjam)     : Rp.4000-");
            System.out.println("Lama pakir anda adalah    : " + parkir + " Jam");
            System.out.println("Total parkir anda adalah  : " + "Rp." + (4000*parkir) + "-");
        }
    }
}