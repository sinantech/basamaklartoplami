import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {
        int a, b, sonuc = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz lüdfen : ");
        a = inp.nextInt();
        while (a != 0) {
            b = a % 10;
            sonuc += b;
            a /= 10;
        }
        System.out.println("Sonuc : " + sonuc);
    }
}
