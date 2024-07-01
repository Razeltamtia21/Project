import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {
        LocalDateTime WaktuSekarang = LocalDateTime.now();
        DateTimeFormatter kalender = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String hasil = WaktuSekarang.format(kalender);
        System.out.println("Tanggal dan waktu yang diformat: " + hasil);
    }
}
