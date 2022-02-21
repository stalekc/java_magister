package lr33;

import java.util.Scanner;

public class lr336 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        in.nextLine();
        int j = 0;
        Rose rose = new Rose();
        for (int i = 0; i < amount; i++) {
            rose.bloom(in.next(), in.nextInt());
            in.nextLine();
            System.out.println(rose);
        }
        amount = in.nextInt();
        in.nextLine();
        for (int i = 0; i < amount; i++) {
            rose.wither(in.nextInt());
            System.out.println(rose);
        }
        in.close();
    }
}
