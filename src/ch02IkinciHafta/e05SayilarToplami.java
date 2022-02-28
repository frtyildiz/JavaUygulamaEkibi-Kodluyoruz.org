package src.ch02IkinciHafta;

import java.util.Scanner;

public class e05SayilarToplami {
    public static void main(String[] args) {
        // Kullanıcıdan 10 adet sayı alarak bu sayıların toplamını ekranda gösterelim
        int tekrarSayisi = 0;
        int toplam = 0;

        do {
            tekrarSayisi++;
            Scanner sayi = new Scanner(System.in);
            System.out.print(tekrarSayisi + ". Sayıyı Giriniz: ");
            int gelenSayi = sayi.nextInt();

            toplam += gelenSayi;
        }while (tekrarSayisi < 10);

        System.out.println("Girmiş Olduğunuz Sayıların Toplamı: " + toplam);
    }
}
