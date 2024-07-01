import java.util.Scanner;
//Razel Michelle Dude Nagara
public class ganji_genap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();
        if(nilai%2==0){
            System.out.println("Nilai: " + nilai + " adalah bilangan " + "Genap");
        }else{
            System.out.println("Nilai: " + nilai + " adalah bilangan " + "Ganjil");
        }
        input.close();
    }
}