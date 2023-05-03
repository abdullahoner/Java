package patika;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,sonuc;
        char islem;
        System.out.println("işlem yapacağınız birinci sayiyi giriniz");
        a = scan.nextInt();
        System.out.println("işlem yapacağınız ikinci sayiyi giriniz");
        b = scan.nextInt();
        System.out.println("işlem yapacağınız islemi giriniz");
        islem = scan.next().charAt(0);


        switch (islem) {
            case '+' :
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
            default: break;
        }
    }
}
