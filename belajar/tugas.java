import java.util.Scanner;

    public class tugas{

        public static void main(String[] args){

            String hewan, khas;
            Scanner input = new Scanner(System.in);  

             System.out.println("\n\n\t\t  Tugas latihan Rpl X");
                System.out.println("\n1. Tuliskan code untuk mengetahui salah satu ciri khas hewan!");
                     System.out.print("Masukkan nama hewan: ");
                     hewan = input.nextLine();
                     System.out.print(hewan + " ciri khas hewan tersebut: ");
                     khas = input.nextLine();
            
                System.out.println("\n2. Tuliskan code untuk mencari nilai rata-rata dari angka 10, 32 dan 24!");
                    int nilai1 = 10;
                    int nilai2 = 32;
                    int nilai3 = 24;

                    int rata2 = (nilai1 + nilai2 + nilai3) / 3;
                    System.out.println("Nilai rata-rata dari angka 10, 32 dan 24 adalah: " + rata2);

                    System.out.println("\n3. Tuliskan code untuk mencari hasil perhitungan di bawah ini!");
                    System.out.println("\n     a. Luas segitiga dengan nilai alas = 20 dan tinggi = 5");
                    System.out.println("\n     b. keliling lingkaran dengan nilai jari-jari 7");
                    System.out.println("\n\t              Hasil dari nomor 3");
                    int alas = 20;
                    int tinggi = 5;

                    int luas = (alas * tinggi) / 2;
                    System.out.println("\na. Luas segitiga dengan nilai alas = 20 dan tinggi = 5 adalah: " + luas);

                    double jarijari = 7;
                    double keliling = 2 * 3.14 * jarijari;
                    System.out.println("b. Keliling lingkaran dengan nilai jari-jari 7 adalah: " + keliling);
    }
}