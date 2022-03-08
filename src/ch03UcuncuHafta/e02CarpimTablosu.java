package src.ch03UcuncuHafta;

import java.util.Scanner;

public class e02CarpimTablosu {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.print("Çarpım Tablosunu Almak İstediğiniz Sayı: ");
        int gelenSayi = sayi.nextInt();

        if (gelenSayi < 0)
            System.out.println("Lütfen Poizitif Bir Sayı Giriniz.");
        else
        {
            System.out.println(gelenSayi + " Sayısının Çarpım Tablosu");
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(gelenSayi + " x " + i + " = " + (gelenSayi * i));
            }
        }

    }
}
