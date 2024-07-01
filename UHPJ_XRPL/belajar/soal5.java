import java.util.Scanner;
public class soal5{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Masukkan jumlah array: ");
int jumlah = input.nextInt();

int[] array = new int[jumlah];

for(int i = 0; i < jumlah; i++){
System.out.print("Masukkan nilai ke " + (i+1) + ": ");
array[i] = input.nextInt();
}

int max = array[0];
for(int i = 0; i < jumlah; i++){
if(array[i] > max){
max = array[i];
}
}
System.out.println("Nilai array tertinggi adalah: " + max);

int min = array[0];
for(int i = 0; i < jumlah; i++){
if(array[i] < min){
min = array[i];
}
}
System.out.println("Nilai array terendah adalah: " + min);
}
}