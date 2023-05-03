package patika;

import java.util.Scanner;

public class ucakBiletiHesapla {
    public static void main(String[] args) {
        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
        //yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
        //İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın;
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
        //olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        int km,yas;
        String yolculukTipi;
        double kmUcret=0.10,indirim,indirimsizTutar=0,indirimliTutar=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("ucusun kaç km oldugunu yaziniz");
        km = scan.nextInt();
        System.out.println("yasinizi yaziniz");
        yas = scan.nextInt();
        System.out.println("ucusunuz tek yon ise 1 gidis donus ise 2'ye basiniz");
        yolculukTipi = scan.next();
        if ((yas>0 || yas<150) && (km>0 || km<5000) && (yolculukTipi.equals("1") || yolculukTipi.equals("2"))) {

            if (yas<=12){
            if (yolculukTipi.equals("1")){
                indirimsizTutar = km*kmUcret;
                indirimliTutar = indirimsizTutar/2;
            } else if (yolculukTipi.equals("2")){
                indirimsizTutar = (km*2)*kmUcret;
                indirimliTutar = indirimsizTutar/2;
            }
            } else if (yas>12 || yas<=24) {
                if (yolculukTipi.equals("1")){
                    indirimsizTutar = km*kmUcret;
                    indirimliTutar = +indirimsizTutar-(indirimsizTutar*0.10);
                } else if (yolculukTipi.equals("2")){
                    indirimsizTutar = (km*2)*kmUcret;
                    indirimliTutar = indirimsizTutar-(indirimsizTutar*0.10);
                    indirimliTutar=indirimliTutar-(indirimliTutar*0.20);
                }
            } else if (yas > 24 || yas <= 65) {
                if (yolculukTipi.equals("1")){
                    indirimsizTutar = km*kmUcret;
                } else if (yolculukTipi.equals("2")){
                    indirimsizTutar = (km*2)*kmUcret;
                    indirimliTutar = indirimsizTutar-(indirimsizTutar*0.20);
                }
            } else if (yas > 65) {
                if (yolculukTipi.equals("1")){
                    indirimsizTutar = km*kmUcret;
                    indirimliTutar = +indirimsizTutar-(indirimsizTutar*0.30);
                } else if (yolculukTipi.equals("2")){
                    indirimsizTutar = (km*2)*kmUcret;
                    indirimliTutar = indirimsizTutar-(indirimsizTutar*0.30);
                    indirimliTutar=indirimliTutar-(indirimliTutar*0.20);
                }
            }
        }
        else {
            System.out.println("hatali giris yaptiniz");
        }
        System.out.println("indirimsiz tutar : "+ indirimsizTutar+"TL");
        System.out.println("indirimli tutar : "+ indirimliTutar+"TL");
    }
}
