package lr33;

import java.util.ArrayList;
import java.util.Objects;

public class Tree {
    private ArrayList<List> list_array;

    public Tree() {
        this.list_array = new ArrayList<List>();
    }

    public ArrayList<List> getList_array() {
        return list_array;
    }

    public void setList_array(ArrayList<List> list_array) {
        this.list_array = list_array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(list_array, tree.list_array);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list_array);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "list_array=" + list_array +
                '}';
    }

    public void bloom(String color, int id){
        this.list_array.add(new List(id, color));
    }
    public void leaf_fall(){
        this.list_array = new ArrayList<List>();
    }
    public void frost(){
        for (List list : this.list_array) {
            list.setColor("Blue");
        }
    }

    public void fall(){
        for (List list : this.list_array) {
            list.setColor("Yellow");
        }
    }
}
