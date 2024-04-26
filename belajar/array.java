import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cetak isi array.");
            System.out.println("2. Temukan nilai maksimum.");
            System.out.println("3. Temukan nilai minimum.");
            System.out.println("4. Hitung rata-rata nilai.");
            System.out.println("5. Keluar.");
            System.out.print("\nPilih menu (1/2/3/4/5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printArray(array);
                    break;
                case 2:
                    System.out.println("Nilai maksimum dalam array: " + findMax(array));
                    break;
                case 3:
                    System.out.println("Nilai minimum dalam array: " + findMin(array));
                    break;
                case 4:
                    System.out.println("Rata-rata dari nilai-nilai dalam array: " + calculateAverage(array));
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void printArray(int[] arr) {
        System.out.print("Isi array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
