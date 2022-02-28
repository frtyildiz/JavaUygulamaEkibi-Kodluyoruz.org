package src.ch02IkinciHafta;

import java.util.Arrays;
import java.util.Scanner;

public class e03AlfabetikSiralama {
    public static void main(String[] args) {
        // Kullanıcının gireceği kelimelerden oluşan diziyi alfabetik olarak sıralamayalım
        Scanner giri = new Scanner(System.in);
        System.out.print("Metin: ");
        String gelenGiri = giri.nextLine();

        String harfKücült = gelenGiri.toLowerCase();
        String kelime = harfKücült.replaceAll(" ", "");
        String[] kelimeler = new String[kelime.length()];
        String strAyirma = "";

        for (int i = 0; i < kelime.length(); i++)
        {
            kelimeler[i] = String.valueOf(kelime.charAt(i));
        }

        Arrays.sort(kelimeler);
        System.out.println(Arrays.toString(kelimeler));
    }
}
