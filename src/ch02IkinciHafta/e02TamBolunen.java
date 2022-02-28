package src.ch02IkinciHafta;

import java.util.Scanner;

public class e02TamBolunen {
    public static void main(String[] args) {
        // 1 ile Kullanıcıdan Gelen Sayı Arasındaki Sayıların Hangilerinin 3 ve 7'ye Bölündüğünü Bulalım.

        Scanner sayi = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int gelenSayi = sayi.nextInt();

        while (gelenSayi > 0)
        {
            if (gelenSayi % 3 == 0 && gelenSayi % 7 == 0)
                System.out.println(gelenSayi);
            gelenSayi--;
        }
    }
}
