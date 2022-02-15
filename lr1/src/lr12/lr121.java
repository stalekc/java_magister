package lr12;

import java.util.Scanner;

public class lr121 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Четные");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0){
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Нечетные");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0){
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
    }
}
