package patika;

import java.util.Scanner;

public class notOrtalamasiHesapla {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        int matNot = scan.nextInt();

        System.out.print("fizik notunuzu giriniz : ");
        int fizikNot = scan.nextInt();

        System.out.print("kimya notunuzu giriniz : ");
        int kimyaNot = scan.nextInt();

        System.out.print("turkce notunuzu giriniz : ");
        int turkceNot = scan.nextInt();

        System.out.print("tarih notunuzu giriniz : ");
        int tarihNot = scan.nextInt();

        System.out.print("muzik notunuzu giriniz : ");
        int muzikNot = scan.nextInt();

        double notOrtalamasi = (double)(matNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot)/6;

        System.out.println("ogrencinin not ortalamasi : "+notOrtalamasi);

        String durum = notOrtalamasi >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(durum);
    }
}
