package lr34;

public class lr346 {
    public static void main(String[] args) {
        Bureau b = new Bureau();
        b.add_to_team(new Constructor(1));
        b.add_to_team(new Constructor(2));
        b.add_to_team(new Constructor(3));
        b.add_to_team(new Constructor(4));
        b.add_to_team(new Constructor(5));
        System.out.println(b);
        b.add_task(new Customer(1), 2);
        b.add_task(new Customer(2), 3);
        System.out.println(b);
        b.create_team(2);
        b.create_team(3);
        System.out.println(b);
        b.delete_team(2);
        System.out.println(b);
    }
}
