package lr11;

import java.util.Scanner;

public class lr113 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Hello";
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
