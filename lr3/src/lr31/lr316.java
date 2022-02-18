package lr31;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lr316 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Drob[] my_array = new Drob[amount];
        int n = 3 * amount;
        for (int i = 0; i < amount; i++) {
            int a = ThreadLocalRandom.current().nextInt(2, n + 1);
            int b = ThreadLocalRandom.current().nextInt(2, n + 1);
            int[] c = new int[a];
            for (int j = 0; j < a; j++) {
                c[j] = ThreadLocalRandom.current().nextInt(2, n + 1);
            }
            my_array[i] = new Drob(a, b, c);
        }
        System.out.println("my_array:");
        for (int i = 0; i < amount; i++) {
            System.out.println(my_array[i]);
        }
        System.out.println("sum = " + Drob.sum(my_array[0], my_array[1]));
        System.out.println("min = " + Drob.min(my_array[0], my_array[1]));
        System.out.println("mul = " + Drob.mul(my_array[0], my_array[1]));
        System.out.println("div = " + Drob.div(my_array[0], my_array[1]));
    }

}
