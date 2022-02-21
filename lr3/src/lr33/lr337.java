package lr33;

import java.util.Scanner;

public class lr337 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        in.nextLine();
        int j = 0;
        Tree tree = new Tree();
        for (int i = 0; i < amount; i++) {
            tree.bloom(in.next(), in.nextInt());
            in.nextLine();
            System.out.println(tree);
        }
        tree.frost();
        System.out.println(tree);
        tree.fall();
        System.out.println(tree);
        tree.leaf_fall();
        System.out.println(tree);
        in.close();
    }
}
