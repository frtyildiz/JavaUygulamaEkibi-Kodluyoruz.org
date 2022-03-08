package src.ch01IlkHafta;

import java.util.Scanner;

public class e05NeKadarSayilariTopla {
    public static void main(String[] args) {
        // 1'den, kullanıcıdan gelen sayıya kadar olan sayıların toplamını verir.
        Scanner sayi = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int gelenSayi = sayi.nextInt();

        int toplam = 0;
        for (int i = 1; i <= gelenSayi; i++)
        {
            toplam += i;
        }

        System.out.println("1'den " + gelenSayi + " Sayısına Kadar Olan Sayıların Toplamı: " + toplam);
    }
}
