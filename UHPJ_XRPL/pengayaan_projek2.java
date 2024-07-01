import java.util.Scanner;
public class pengayaan_projek2{
    //Razel Michelle Dude Nagara
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean selesai = false;
        while(!selesai){
        while (true) {
            System.out.println("\nPilih bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Keluar");
            System.out.print("\nMasukkan pilihan (1-4): ");
            int pilihan = input.nextInt();
            
                if(pilihan == 1){
                        System.out.print("Masukkan panjang: ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar: ");
                        double lebar = input.nextDouble();
                
                        double keliling = 2 * (panjang + lebar);
                        double luas = panjang * lebar;
                
                        System.out.println("\nKeliling Persegi Panjang: " + keliling);
                        System.out.println("\nLuas Persegi Panjang: " + luas);
                        continue;

                }else if(pilihan == 2){
                        System.out.print("Masukkan sisi a: ");
                        double a = input.nextDouble();
                        System.out.print("Masukkan sisi b: ");
                        double b = input.nextDouble();
                        System.out.print("Masukkan sisi c: ");
                        double c = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        double tinggi = input.nextDouble();
                
                        double keliling = a + b + c;
                        double luas = 0.5 * a * tinggi;
                
                        System.out.println("\nKeliling Segitiga: " + keliling);
                        System.out.println("\nLuas Segitiga: " + luas);
                        continue;

                }else if(pilihan == 3){
                    System.out.print("Masukkan jari-jari: ");
                    double jariJari = input.nextDouble();
        
                    double keliling = 2 * Math.PI * jariJari;
                    double luas = Math.PI * Math.pow(jariJari, 2);
        
                    System.out.println("\nKeliling Lingkaran: " + keliling);
                    System.out.println("\nLuas Lingkaran: " + luas);
                    continue;

                }else if(pilihan == 4){
                    System.out.println("Anda telah keluar dari Aplikasi Bangun Datar :)");
                    selesai = true;
                    break;

                }else{
                    System.out.println("\nPilihan tidak valid. Silahkan Coba lagi...");
                    continue;
                }
            }
        }
        System.out.println("\nBy Razel Michelle Dude Nagara");
    }
}
