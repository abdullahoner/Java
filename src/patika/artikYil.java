package patika;
import  java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("Yılı giriniz: ");
        year = scan.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.print(year + " yılı artık yıldır.");
        }else{
            System.out.print(year + " yılı artık bir yıl değildir.");
        }
    }

}
