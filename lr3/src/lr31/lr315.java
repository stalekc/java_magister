package lr31;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lr315 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        My_matrix[] my_array = new My_matrix[amount];
        int n = 3 * amount;
        for (int i = 0; i < amount; i++) {
            int ax_x = ThreadLocalRandom.current().nextInt(2, n + 1);
            int ax_y = ThreadLocalRandom.current().nextInt(2, n + 1);
            my_array[i] = new My_matrix(ax_x, ax_y);
            for (int j = 0; j < ax_x; j++) {
                for (int k = 0; k < ax_y; k++) {
                    my_array[i].setNumber(j, k, ThreadLocalRandom.current().nextInt(-n, n + 1));
                }
            }
        }
        for (int i = 0; i < amount; i++) {
            System.out.println("Matrix " + i);
            int[][] temp = my_array[i].getNumbers();
            for (int j = 0; j < temp.length; j++) {
                System.out.println(Arrays.toString(temp[j]));
            }
        }
        System.out.println("input k");
        int for_swap = in.nextInt();
        for (int i = 0; i < amount; i++) {
            my_array[i].change(for_swap);
        }
        System.out.println("swapped lines:");
        for (int i = 0; i < amount; i++) {
            System.out.println("Matrix " + i);
            int[][] temp = my_array[i].getNumbers();
            for (int j = 0; j < temp.length; j++) {
                System.out.println(Arrays.toString(temp[j]));
            }
        }
        System.out.println("input i");
        int for_square = in.nextInt();
        my_array[for_square] = my_array[for_square].square();
        System.out.println("Squared matrix");
        for (int i = 0; i < amount; i++) {
            System.out.println("Matrix " + i);
            int[][] temp = my_array[i].getNumbers();
            for (int j = 0; j < temp.length; j++) {
                System.out.println(Arrays.toString(temp[j]));
            }
        }
    }
}
