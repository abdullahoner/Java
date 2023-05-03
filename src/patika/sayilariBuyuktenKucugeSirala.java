package patika;

import java.util.Scanner;

public class sayilariBuyuktenKucugeSirala {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("a sayısını giriniz");
        a=scan.nextInt();
        System.out.println("b sayısını giriniz");
        b=scan.nextInt();
        System.out.println("c sayısını giriniz");
        c=scan.nextInt();
        if(a<b && a<c){
            if(b<c){
                System.out.print("Kucukten buyuge dogru siralama: " +a +" " +b +" " +c);
            }
            else{
                System.out.print("Kucukten buyuge dogru siralama: " +a + " " +c +" " +b);
            }
        } else if (b<a && b<c) {
            if(a<c){
                System.out.print("Kucukten buyuge dogru siralama: " +b + " " +a +" " +c);
            }
            else{
                System.out.print("Kucukten buyuge dogru siralama: " +b + " " +c +" " +a);
            }
        } else if (b<a) {
            System.out.print("Kucukten buyuge dogru siralama: " +c + " " +b +" " +a);
        }
        else{
            System.out.print("Kucukten buyuge dogru siralama: " +c + " " +a +" " +b);
        }
    }
}
