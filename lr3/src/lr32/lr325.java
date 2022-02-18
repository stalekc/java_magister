package lr32;

import java.util.Objects;
import java.util.Scanner;

public class lr325 {
    public static void main(String[] args) {
        Book[] my_book = Book.make_list(5);
        my_book[0] = new Book(1, "1", "1", "1", 1, 1, 1, false);
        my_book[1] = new Book(2, "2", "1", "1", 2, 1, 1, false);
        my_book[2] = new Book(3, "3", "2", "1", 3, 1, 1, false);
        my_book[3] = new Book(4, "4", "2", "1", 4, 1, 1, false);
        my_book[4] = new Book(5, "5", "2", "2", 5, 1, 1, false);
        System.out.println("books of author 2:");
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(my_book[i].getAuthor(), "2")){
                System.out.println(my_book[i]);
            }
        }
        System.out.println("books of publisher 1:");
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(my_book[i].getPublisher(), "1")){
                System.out.println(my_book[i]);
            }
        }
        System.out.println("books of year later 3:");
        for (int i = 0; i < 5; i++) {
            if (my_book[i].getYear() > 3){
                System.out.println(my_book[i]);
            }
        }
    }
}
