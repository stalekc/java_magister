package lr11;

import java.util.Scanner;

public class lr114 {
    public static void main(String[] args) {
        String example = "password";
        Scanner in = new Scanner(System.in);
        String test_str = in.next();
        if (example.equals(test_str)){
            System.out.println("same");
        }
        else{
            System.out.println("ne same");
        }
    }
}
