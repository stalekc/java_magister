package lr34;


public class lr345 {
    public static void main(String[] args) {
        Library library = new Library();
        library.add_book(new Book(1, "11"));
        library.add_book(new Book(2, "11"));
        library.add_book(new Book(3, "12"));
        System.out.println(library);
        Visitor v1 = new Visitor(1);
        Visitor v2 = new Visitor(2);
        library.give_book(v1, new Book(1, "11"), true);
        library.give_book(v1, new Book(2, "11"), false);
        library.give_book(v2, new Book(1, "11"), true);
        System.out.println(library);
        library.return_book(new Book(1, "11"));
        library.return_book(new Book(4, "11"));
        System.out.println(library);
        library.add_to_black_list(v1);
        System.out.println(library);
    }
}
