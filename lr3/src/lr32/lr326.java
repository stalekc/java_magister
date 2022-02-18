package lr32;

import java.util.Objects;

public class lr326 {
    public static void main(String[] args) {
        House[] my_house = House.make_list(5);
        my_house[0] = new House(1, 1, 1, 1, 1, "1", false, 1);
        my_house[1] = new House(2, 1, 2, 2, 1, "1", false, 1);
        my_house[2] = new House(3, 1, 3, 1, 2, "1", false, 1);
        my_house[3] = new House(4, 1, 4, 3, 1, "1", false, 1);
        my_house[4] = new House(5, 1, 5, 4, 1, "1", false, 1);
        System.out.println("flats with 1 room:");
        for (int i = 0; i < 5; i++) {
            if (my_house[i].getRoom_amount() == 1){
                System.out.println(my_house[i]);
            }
        }
        System.out.println("flats with 1 room between 2 and 3 floors:");
        for (int i = 0; i < 5; i++) {
            if (my_house[i].getRoom_amount() == 1 && my_house[i].getFloor() >= 2 && my_house[i].getFloor() <= 3){
                System.out.println(my_house[i]);
            }
        }
        System.out.println("flats Square > 2");
        for (int i = 0; i < 5; i++) {
            if (my_house[i].getSquare() > 2){
                System.out.println(my_house[i]);
            }
        }
    }
}
