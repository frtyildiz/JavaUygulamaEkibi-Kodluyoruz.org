package src.ch02IkinciHafta;

import java.util.ArrayList;
import java.util.Scanner;

public class e01AsalSayiListeleme {
    public static void main(String[] args) {
        // 1 ile 1.000.000 arasındaki asal sayıların listelenmesi gerçekleştirilecektir;
        for(int i = 2; i <= 1000000; i++)
        {
            boolean asalMi = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    asalMi = false;
                    break;
                }
            }

            if(asalMi)
            {
                System.out.println(i);
            }
        }
    }
}
