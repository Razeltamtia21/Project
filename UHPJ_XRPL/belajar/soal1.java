import java.util.Scanner;
public class soal1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("\nMasukkan nilai ke pertama: ");
int nilai1 = input.nextInt();

System.out.print("\nMasukkan nilai ke dua: ");
int nilai2 = input.nextInt();

System.out.println("\nBilangan operasi");
System.out.println("[+] pertambahan.");
System.out.println("[-] pengurangan.");
System.out.println("[*] perkalian.");
System.out.println("[/] pembagian.");

boolean selesai = false;
while(!selesai){
System.out.print("\nMasukkan bilangan oparsi (+,-,x,/) atau keluar: ");
String bilangan = input.next();

if(bilangan.equalsIgnoreCase("keluar")){
	System.out.println("\nAnda telah keluar. Selamat tinggal..");
	selesai = true;
}else if(bilangan.equalsIgnoreCase("+")){
	System.out.println("\nHasil pertambahan " + nilai1 + " + " + nilai2 + " adalah: " + (nilai1+nilai2));
}else if(bilangan.equalsIgnoreCase("-")){
	System.out.println("\nHasil pengurangan " + nilai1 + " - " + nilai2 + " adalah: " + (nilai1-nilai2));
}else if(bilangan.equalsIgnoreCase("x")){
	System.out.println("\nHasil perkalian " + nilai1 + " x " + nilai2 + " adalah: " + (nilai1*nilai2));
}else if(bilangan.equalsIgnoreCase("/")){
	System.out.println("\nHasil pembagian " + nilai1 + " / " + nilai2 + " adalah: " + (nilai1/nilai2));
}else{
System.out.println("[Error] Bilangan tidak valid. Silahkan coba lagi...");
continue;
}
}
}
}