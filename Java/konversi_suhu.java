import java.util.Scanner;
//Razel Michelle Dude Nagara
public class konversi_suhu{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan derajat celsius: ");
        int celsius = input.nextInt();
        int kelvin = (celsius + 273);
        int fahrenheit = (celsius * 9/5) + 32;
        int reamur = (celsius * 4/5);
        
        System.out.println(celsius + " derajat celsius adalah: " + kelvin + " derajat Kelvin");
        System.out.println(celsius + " derajat celsius adalah: " + fahrenheit + " derajat Fahrenheit");
        System.out.println(celsius + " derajat celsius adalah: " + reamur + " derajat Reamur");
    }
}