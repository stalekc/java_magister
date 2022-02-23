package lr34;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Library {
    private HashMap<Book, Boolean> catalogue;
    private HashMap<Book, Visitor> subscription;
    private HashMap<Book, Visitor> hall;
    private Set<Visitor> black_list;

    public Library() {
        catalogue = new HashMap<>();
        subscription = new HashMap<>();
        hall = new HashMap<>();
        black_list = new HashSet<>();
    }

    public void add_book(Book book){
        catalogue.put(book, true);
    }

    public void give_book(Visitor visitor, Book book, @NotNull Boolean where){
        if (catalogue.containsKey(book) && catalogue.get(book)){
            catalogue.put(book, false);
            if (where){
                subscription.put(book, visitor);
            } else {
                hall.put(book, visitor);
            }
        }
    }

    public void return_book(Book book){
        if (catalogue.containsKey(book)){
            catalogue.put(book, false);
            subscription.remove(book);
            hall.remove(book);
        }
    }

    public void add_to_black_list(Visitor visitor){
        black_list.add(visitor);
    }

    @Override
    public String toString() {
        return "Library{" +
                "catalogue=" + catalogue +
                ", subscription=" + subscription +
                ", hall=" + hall +
                ", black_list=" + black_list +
                '}';
    }
}
