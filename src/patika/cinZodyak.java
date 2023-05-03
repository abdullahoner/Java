package patika;

import java.util.Scanner;

public class cinZodyak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz : ");
        int yil = scan.nextInt();
        int kalan = yil % 12;
        switch (kalan) {
            case 0:
                System.out.println("burcunuz maymun");
                break;
            case 1:
                System.out.println("burcunuz horoz");
                break;
            case 2:
                System.out.println("burcunuz köpek");
                break;
            case 3:
                System.out.println("burcunuz d0muz");
                break;
            case 4:
                System.out.println("burcunuz maymun");
                break;
            case 5:
                System.out.println("burcunuz fare");
                break;
            case 6:
                System.out.println("burcunuz öküz");
                break;
            case 7:
                System.out.println("burcunuz kaplan");
                break;
            case 8:
                System.out.println("burcunuz tavşan");
                break;
            case 9:
                System.out.println("burcunuz ejderha");
                break;
            case 10:
                System.out.println("burcunuz yılan");
                break;
            case 11:
                System.out.println("burcunuz at");
                break;
            case 12:
                System.out.println("burcunuz koyun");
        }
    }
}
