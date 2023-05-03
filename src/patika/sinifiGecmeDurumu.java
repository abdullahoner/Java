package patika;

import java.util.Scanner;

public class sinifiGecmeDurumu {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Matematik, Fizik, Türkçe, Kimya, Müzik
        int mat,fizik,turkce,kimya,muzik,dersSayisi=0;
        double gecmenotu=55,ortalama=0;
        System.out.print("matematik notunuzu giriniz : ");
        mat = scan.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scan.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = scan.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scan.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = scan.nextInt();

        if (mat>0 && mat<=100){
            ortalama+=mat;
            dersSayisi++;
        }if (fizik>0 && fizik<=100){
            ortalama+=fizik;
            dersSayisi++;
        }if (turkce>0 && turkce<=100){
            ortalama+=turkce;
            dersSayisi++;
        }if (kimya>0 && kimya<=100){
            ortalama+=kimya;
            dersSayisi++;
        }if (muzik>0 && muzik<=100){
            ortalama+=muzik;
            dersSayisi++;
        }if ((ortalama/dersSayisi)>=gecmenotu){
            System.out.println("sinifi gectiniz ! notunuz : "+(ortalama/dersSayisi));
        }else {
            System.out.println("sinifi gecemediniz ! notunuz : "+(ortalama/dersSayisi));
        }
    }
}
