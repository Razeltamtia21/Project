import java.util.Scanner;
public class soal4{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Masukkan jumlah deret fibonacci: ");
int nilai = input.nextInt();

if(nilai <= 0){
	System.out.println(nilai + " tidak valid untuk di deret fibonacci..");
}else{
System.out.println("Deret fibonacci");
for(int i = 0; i < nilai; i++){
	System.out.print(fibonacci(i) + " ");
}
System.out.println();
}
input.close();
}

public static int fibonacci(int jumlah){
if(jumlah <= 1){
return jumlah;
}else{
return fibonacci(jumlah - 1) + fibonacci(jumlah -2);
}
}
}