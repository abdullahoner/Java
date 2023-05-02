package patika;

import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        /*
        Manav Kasa Programı
         Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
         değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
         Meyveler ve KG Fiyatları
         Armut : 2,14 TL
         Elma : 3,67 TL
         Domates : 1,11 TL
         Muz: 0,95 TL
         Patlıcan : 5,00 TL
         */
        Scanner scan = new Scanner(System.in);
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz= 0.95 , patlican = 5.00 ;

        System.out.print("kac kilo armut aldin : ");
        int armutkg = (int) scan.nextDouble();
        System.out.print("kac kilo elma aldin : ");
        int elmakg = (int) scan.nextDouble();
        System.out.print("kac kilo domates aldin : ");
        int domateskg = (int) scan.nextDouble();
        System.out.print("kac kilo muz aldin : ");
        int muzkg = (int) scan.nextDouble();
        System.out.print("kac kilo patlican aldin : ");
        int patlicankg = (int) scan.nextDouble();

        double topTutar = (armut*armutkg)+(elmakg*elma)+(domateskg*domates)+(muzkg*muz)+(patlican*patlicankg);
        System.out.println("topTutar = " + topTutar);


    }
}
