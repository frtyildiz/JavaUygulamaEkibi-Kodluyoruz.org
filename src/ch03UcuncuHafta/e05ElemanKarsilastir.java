package src.ch03UcuncuHafta;

import java.util.Random;

public class e05ElemanKarsilastir {
    public static void main(String[] args) {
        int[] birinciDizi = new int[10];
        int[] ikinciDizi = new int[10];

        Random rastgeleSayi = new Random();

        for (int i = 0; i < birinciDizi.length && i < ikinciDizi.length; i++)
        {
            birinciDizi[i] = rastgeleSayi.nextInt(20);  // 0 ile 20 arasında rastgele sayi üretir.
            ikinciDizi[i] = rastgeleSayi.nextInt(20);
        }

        for (int i = 0; i < birinciDizi.length - 1; i++)
        {
            for (int j = 0; j < ikinciDizi.length - 1; j++)
            {
                if (birinciDizi[i] == ikinciDizi[j])
                    System.out.println("Birinci Dizideki " + i + ". İndekste Bulunan " + birinciDizi[i] + " Sayısı, İkinci Dizide de " + j + ". İndeksinde Bulunmaktadır.");
            }
        }
    }
}
