//Условие задачи было отправлено не полностью, поэтому оно было додумано следующим образом:
//Для каждого числа m вывести период десятичной дроби m/n

package lr12;

import java.util.Arrays;
import java.util.Scanner;

public class lr1215 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int n_abb = n;
        while (n_abb % 2 == 0 || n_abb % 5 == 0){
            if (n_abb % 2 == 0){n_abb /= 2;}
            if (n_abb % 5 == 0){n_abb /= 5;}
        }
        int p_len = 1;
        int deg = 10;
        if (n_abb != 1) {
            while (deg % n_abb != 1) {
                deg *= 10;
                p_len += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % n != 0 && n_abb != 1) {
                double mid = ((double) array[i] / n) % 1;
                String str = mid + "";
                for (int j = 2; j < 2 + p_len; j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.println();
            }
            else{
                System.out.println("0");
            }
        }
    }
}
