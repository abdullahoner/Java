package patika;

import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
        yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler
        aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */



        String userName,password,newPassword,gecerliUserName,gecerliPassword;
        gecerliUserName = "abdullah";
        gecerliPassword = "deneme123";
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen kullanici adinizi giriniz : ");
        userName = scan.nextLine();
        System.out.print("lutfen sifrenizi giriniz : ");
        password = scan.nextLine();

        if (userName.equals(gecerliUserName) && password.equals(gecerliPassword)){
            System.out.println("basarili giris yapildi !");
        }else {
            System.out.println("giris yapilamadi !");
            System.out.println("sifrenizi degistirmek istiyorsanız 1 islemi bitirmek istiyorsaniz 0'a basin");
            int islem = scan.nextInt();
            if (islem==1){
                System.out.println("yeni sifrenizi giriniz");
                scan = new Scanner(System.in);
                newPassword = scan.nextLine();
                if (newPassword.equals(gecerliPassword)){
                    System.out.println("yeni sifre eski sifre ile ayni olamaz");
                }else {
                    System.out.println("sifreniz basari ile degistirildi");
                }

            }else {
                System.exit(0);
            }
        }

    }
}
