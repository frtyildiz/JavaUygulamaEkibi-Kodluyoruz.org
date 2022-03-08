package src.ch01IlkHafta;

import java.util.Scanner;

public class e06CarpimTablosu {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının çarpım tablosunu verir.

        Scanner sayi = new Scanner(System.in);
        System.out.print("Çarpım Tablosunu Almak İstediğiniz Sayıyı Giriniz: ");
        int girilenSayi = sayi.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i + " x " + girilenSayi + " = " + (i * girilenSayi));
        }
    }
}
