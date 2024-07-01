import java.util.Scanner;
public class soal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean selesai = false;

        while(!selesai){
        System.out.println("\nMenu Makanan:");
        System.out.println("1. Nasi Goreng      15k");
        System.out.println("2. Mie Goreng       10k");
        System.out.print("Pilih makanan yang anda inginkan : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi goreng");
                System.out.print("Apakah anda ingin memesan lebih dari 1 (ya/tidak): ");
                String jawaban1 = input.next();

                if (jawaban1.equalsIgnoreCase("tidak")) {
                    System.out.println("Mohon menunggu. Terimakasih");
                    break;

                }else if(jawaban1.equalsIgnoreCase("ya")) {
                    System.out.println("\nBerapa banyak yang anda pesan");
                    int pesanan = input.nextInt();
                    System.out.println("Total pesanan anda adalah : Rp." + (pesanan * 15000));

                }else{
                    System.out.println("\nSepertinya anda bercanda. Silahkan coba lagi...");
                    continue;
                }
                
            case 2:
            System.out.println("Anda memilih Mie Goreng");
            System.out.print("Apakah anda ingin memesan lebih dari 1 (ya/tidak): ");
            String jawaban2 = input.next();

            if (jawaban2.equalsIgnoreCase("tidak")) {
                System.out.println("Mohon menunggu. Terimakasih");
                break;
                
            }else if(jawaban2.equalsIgnoreCase("ya")) {
                System.out.println("\nBerapa banyak yang anda pesan");
                int pesanan = input.nextInt();
                System.out.println("Total pesanan anda adalah : Rp." + (pesanan * 10000));

            }else{
                System.out.println("\nSepertinya anda bercanda. Silahkan coba lagi...");
                continue;

            }default:
                System.out.println("\nPilihan tidak Valid. Silahkan coba lagi...");
                continue;
            }
        }
    }
}