import java.util.Scanner;

public class PemilihanPercobaan2 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.print("Masukan nilai UAS: ");
        float UAS = input00.nextFloat();
        System.out.print("Masukan nilai UTS: ");
        float UTS = input00.nextFloat();
        System.out.print("Masukan nilai KUIS: ");
        float KUIS = input00.nextFloat();
        System.out.print("Masukan nilai TUGAS: ");
        float TUGAS = input00.nextFloat();

        float total = (UAS * 0.4f) + (UTS * 0.3f) + (KUIS * 0.2f) + (TUGAS * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

    }
}