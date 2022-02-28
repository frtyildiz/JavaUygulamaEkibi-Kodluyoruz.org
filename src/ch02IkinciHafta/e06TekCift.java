package src.ch02IkinciHafta;

import java.util.Random;

public class e06TekCift {
    public static void main(String[] args) {
        // Bilgisayarın rastgele tuttuğu 10 sayıdan çift ve tek olanların sayısını gösterelim
        Random rand = new Random();
        int tek = 0;
        int cift = 0;

        for (int i = 0; i < 10; i++)
        {
            int rastgeleSayi = rand.nextInt(100); // 1 ile 100 arasında rastgele sayı oluşturur.
            if (rastgeleSayi % 2 == 0){
                System.out.println(rastgeleSayi + " Çift Sayıdır.");
                cift++;
            }
            else
            {
                System.out.println(rastgeleSayi + " Tek Sayıdır.");
                tek++;
            }
        }
        System.out.println("Rastgele Oluşturulan Sayıların " + cift + " Tanesi Çift ve " + tek + " Tanesi Tek Sayıdır.");
    }
}
