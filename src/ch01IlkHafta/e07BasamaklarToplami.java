package src.ch01IlkHafta;

import java.util.Scanner;

public class e07BasamaklarToplami {
    public static void main(String[] args) {
        // Kullanıcı tarafından girilecek olan sayının basamakları toplamını verir;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int girilenSayi = sayi.nextInt();

        int basamaklarToplami = 0;
        while(girilenSayi != 0)
        {
            basamaklarToplami += (girilenSayi % 10);
            girilenSayi /= 10;
        }

        System.out.println("Girilen Sayının Basamakları Toplamı: " + basamaklarToplami);
    }
}
