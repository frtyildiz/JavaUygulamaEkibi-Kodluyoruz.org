package ch01IlkHafta;

import java.util.Scanner;

public class e04SayiDegisimi {
    public static void main(String[] args) {
        // Girilen iki ondalık sayının yerini değiştirir.
        Scanner sayi = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        double ilkSayi = sayi.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz: ");
        double ikinciSayi = sayi.nextDouble();

        System.out.println("---Değişimden Önce---");
        System.out.println("Birinci Sayı: " + ilkSayi);
        System.out.println("İkinci Sayı: " + ikinciSayi);

        System.out.println("---Değişimden Sonra---");
        System.out.println("Birinci Sayı: " + ikinciSayi);
        System.out.println("İkinci Sayı: " + ilkSayi);
    }
}
