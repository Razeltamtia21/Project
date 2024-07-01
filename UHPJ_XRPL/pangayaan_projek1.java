import java.util.Scanner;
public class pangayaan_parkir{
    //Razel Michelle Dude Nagara
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean selesai = false;
        boolean valid = false;

        while(!selesai){
            System.out.println("\n[1] Masuk ke Aplikasi Parkir");
            System.out.println("[2] keluar Aplikasi Parkir");
            System.out.print("\nMasukkan Pilihan Anda : ");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    System.out.println("\nSelamat Datang di Aplikasi Parkir");
                    System.out.print("\nMasukkan Jenis Kendaraan(mobil/motor): ");
                    String jenis = input.next();
                    if(!jenis.equalsIgnoreCase("mobil") &&!jenis.equalsIgnoreCase("motor")){
                        System.out.println("\nJenis kendaraan tidak tersedia. Coba Lagi..");
                        continue;
                    }
                    while (!valid) {
                        if(jenis.equalsIgnoreCase("mobil")){
                            System.out.print("\nMasukkan No plat kendaraan Mobil anda(Contoh: B1234): ");
                            String plat = input.next();
                            if(plat.length() > 10){
                                System.out.println("\nNo Plat kendaraan tidak boleh melebihi 10. Coba Lagi..");
                                continue;
                            }
                            System.out.print("\nMasukkan Angka. Berapa lama parkir kendaraan(perjam): ");
                            int parkir = input.nextInt();

                            System.out.println("\nMobil perjamnya = Rp.4000-");
                            System.out.println("Total hasil parkir kendraan anda: Rp." + (4000*parkir) + "-");
                            System.out.println("\n\nTerima Kasih telah menggunakan Aplikasi Parkir...");
                            break;

                        }else if(jenis.equalsIgnoreCase("motor")){
                            System.out.print("\nMasukkan No plat kendaraan Motor anda(Contoh: B1234): ");
                            String plat = input.next();
                            if(plat.length() > 10){
                                System.out.println("\nNo Plat kendaraan tidak boleh melebihi 10. Coba Lagi..");
                                continue;
                            }
                            System.out.print("\nMasukkan Angka. Berapa lama parkir kendaraan(perjam): ");
                            int parkir = input.nextInt();
    
                            System.out.println("\nMotor perjamnya = Rp.2000-");
                            System.out.println("Total hasil parkir kendraan anda: Rp." + (2000*parkir) + "-");
                            System.out.println("\n\nTerima Kasih telah menggunakan Aplikasi Parkir...");
                            break;
                        }
                        }
                case 2:
                System.out.println("Anda telah keluar dari Aplikasi Parkir :)");
                    selesai = true;
                    break;
                default:
                    System.out.println("\nPilihan Tidak Tersedia. Coba Lagi....");
                    continue;
            }
        }
        System.out.println("\nBy Razel Michelle Dude Nagara");
    }
}