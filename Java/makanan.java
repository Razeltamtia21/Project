import java.util.Scanner;
//Razel Michelle Dude Nagara
public class makanan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n  SELAMAT DATANG DIRUMAH PESANAN");

        System.out.println("\n[1] Nasi goreng      Rp.13000-");
        System.out.println("[2] Nasi ayam        Rp.15000-");
        System.out.println("[3] Sop daging sapi  Rp.18000-");

        System.out.print("\nSilahkan pilih menu makanan anda: ");
        int makanan = input.nextInt();

        System.out.println("\n[1] Jus jeruk     Rp.6000-");
        System.out.println("[2] Es kepala     Rp.8000-");
        System.out.println("[3] Air mineral   Rp.4000-");

        System.out.print("\nSilahkan pilih menu minuman anda: ");
        int minuman = input.nextInt();

        System.out.println("\n  SEDANG DALAM PROSES");
        if(makanan == 1){
            System.out.println("\n[menu makanan]: Nasi goreng");
            System.out.print("Masukkan jumlah Nasi goreng yang anda inginkan: ");
            int jumlah_makanan1 = input.nextInt();
            int makanan1 = jumlah_makanan1 * 13000;
            if(minuman == 1){
                System.out.println("\n[menu minuman]: Jus jeruk");
                System.out.print("Masukkan jumlah Jus jeruk yang anda inginkan: ");
                int jumlah_minuman1 = input.nextInt();
                int minuman1 = jumlah_minuman1 * 6000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan1+minuman1) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang1 = input.nextInt();
                int total1 = makanan1+minuman1;
                if(uang1 <= total1){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian1 = uang1 - total1;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian1 + "-");
                }
            }
            if(minuman == 2){
                System.out.println("\n[menu minuman]: Es kelapa");
                System.out.print("Masukkan jumlah Es kepala yang anda inginkan: ");
                int jumlah_minuman2 = input.nextInt();
                int minuman2 = jumlah_minuman2 * 8000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan1+minuman2) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang2 = input.nextInt();
                int total2 = makanan1+minuman2;
                if(uang2 <= total2){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian2 = uang2 - total2;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian2 + "-");
                }
            }
            if(minuman == 3){
                System.out.println("\n[menu minuman]: Air mineral");
                System.out.print("Masukkan jumlah Air mineral yang anda inginkan: ");
                int jumlah_minuman3 = input.nextInt();
                int minuman3 = jumlah_minuman3 * 4000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan1+minuman3) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang3 = input.nextInt();
                int total3 = makanan1+minuman3;
                if(uang3 <= total3){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian3 = uang3 - total3;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian3 + "-");
                }
            }
        }   
        if(makanan == 2){
            System.out.println("\n[menu makanan]: Nasi ayam");
            System.out.print("Masukkan jumlah Nasi ayam yang anda inginkan: ");
            int jumlah_makanan2 = input.nextInt();
            int makanan2 = jumlah_makanan2 * 15000;
            if(minuman == 1){
                System.out.println("\n[menu minuman]: Jus jeruk");
                System.out.print("Masukkan jumlah Jus jeruk yang anda inginkan: ");
                int jumlah_minuman1 = input.nextInt();
                int minuman1 = jumlah_minuman1 * 6000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan2+minuman1) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang1 = input.nextInt();
                int total1 = makanan2+minuman1;
                if(uang1 <= total1){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian1 = uang1 - total1;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian1 + "-");
                }
            }
            if(minuman == 2){
                System.out.println("\n[menu minuman]: Es kelapa");
                System.out.print("Masukkan jumlah Es kepala yang anda inginkan: ");
                int jumlah_minuman2 = input.nextInt();
                int minuman2 = jumlah_minuman2 * 8000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan2+minuman2) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang2 = input.nextInt();
                int total2 = makanan2+minuman2;
                if(uang2 <= total2){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian2 = uang2 - total2;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian2 + "-");
                }
            }
            if(minuman == 3){
                System.out.println("\n[menu minuman]: Air mineral");
                System.out.print("Masukkan jumlah Air mineral yang anda inginkan: ");
                int jumlah_minuman3 = input.nextInt();
                int minuman3 = jumlah_minuman3 * 4000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan2+minuman3) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang3 = input.nextInt();
                int total3 = makanan2+minuman3;
                if(uang3 <= total3){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian3 = uang3 - total3;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian3 + "-");
                }
            }
        }
        if(makanan == 3){
            System.out.println("\n[menu makanan]: Sop daging sapi");
            System.out.print("Masukkan jumlah Sop daging sapi yang anda inginkan: ");
            int jumlah_makanan3 = input.nextInt();
            int makanan3 = jumlah_makanan3 * 18000;
            if(minuman == 1){
                System.out.println("\n[menu minuman]: Jus jeruk");
                System.out.print("Masukkan jumlah Jus jeruk yang anda inginkan: ");
                int jumlah_minuman1 = input.nextInt();
                int minuman1 = jumlah_minuman1 * 6000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan3+minuman1) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang1 = input.nextInt();
                int total1 = makanan3+minuman1;
                if(uang1 <= total1){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian1 = uang1 - total1;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian1 + "-");
                }
            }
            if(minuman == 2){
                System.out.println("\n[menu minuman]: Es kelapa");
                System.out.print("Masukkan jumlah Es kepala yang anda inginkan: ");
                int jumlah_minuman2 = input.nextInt();
                int minuman2 = jumlah_minuman2 * 8000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan3+minuman2) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang2 = input.nextInt();
                int total2 = makanan3+minuman2;
                if(uang2 <= total2){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian2 = uang2 - total2;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian2 + "-");
                }
            }
            if(minuman == 3){
                System.out.println("\n[menu minuman]: Air mineral");
                System.out.print("Masukkan jumlah Air mineral yang anda inginkan: ");
                int jumlah_minuman3 = input.nextInt();
                int minuman3 = jumlah_minuman3 * 4000;
                System.out.println("\n[total pemesanan]: " + "Rp." + (makanan3+minuman3) + "-");
                System.out.println("Masukkan uang tunai: ");
                int uang3 = input.nextInt();
                int total3 = makanan3+minuman3;
                if(uang3 <= total3){
                    System.out.println("\n  MAAF UANG ANDA TIDAK CUKUP");
                }
                else{
                    int kembalian3 = uang3 - total3;
                    System.out.println("\n  KEMBALIAN: " + "Rp." + kembalian3 + "-");
                }
            }
        }
    }
}