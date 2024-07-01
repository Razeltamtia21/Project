import java.util.Scanner;
public class latihan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();
        
        if(nama.equalsIgnoreCase("razel")){
            System.out.println("admin");
        }else if(nama.equalsIgnoreCase("ronaldo")){
            System.out.println("Goat");
        }else if(nama.equalsIgnoreCase("messi")){
            System.out.println("Cupu");
        }else if(nama.trim().equalsIgnoreCase("gerald")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("fatih")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("davarel")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("athala")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("dafa")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("andi")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("mirza")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("akbar")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("arsyad")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("raja")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("nasrullah")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.trim().equalsIgnoreCase("monyet")){
            System.out.println( nama + " nama anda terdaftar! ");
        }else if(nama.isEmpty()){
            System.out.println("harap di isi!");
        }else{
            System.out.println( nama + " nama anda tidak terdaftar! ");
        }
    }
}