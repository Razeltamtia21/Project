import java.util.Scanner;
public class mau{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Masukkan inputan: ");
String pengguna = input.next();

System.out.print("Mau berapa cetakan? ");
int jumlah = input.nextInt();

for(int i = 0; i < jumlah; i++){
System.out.println((i+1)+ ". " + pengguna);
}
}
}