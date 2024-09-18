import java.util.Scanner;

public class Percobaan2WRI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        
        System.out.println("Masukan angka: ");
        angka = input.nextInt();

        String hasil;

        hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println(hasil);

        

    }
}