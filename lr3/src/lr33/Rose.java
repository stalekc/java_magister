package lr33;

import java.util.ArrayList;
import java.util.Objects;

public class Rose {
    private ArrayList<Bud> bud_list;
    private ArrayList<Petal> petal_list;

    public Rose() {
        this.bud_list = new ArrayList<Bud>();
        this.petal_list = new ArrayList<Petal>();
    }

    public ArrayList<Bud> getBud_list() {
        return bud_list;
    }

    public void setBud_list(ArrayList<Bud> bud_list) {
        this.bud_list = bud_list;
    }

    public ArrayList<Petal> getPetal_list() {
        return petal_list;
    }

    public void setPetal_list(ArrayList<Petal> petal_list) {
        this.petal_list = petal_list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return Objects.equals(bud_list, rose.bud_list) && Objects.equals(petal_list, rose.petal_list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bud_list, petal_list);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "bud_list=" + bud_list +
                ", petal_list=" + petal_list +
                '}';
    }

    public void bloom(String color, int id){
        this.bud_list.add(new Bud(color, id));
        this.petal_list.add(new Petal(color, id));
    }
    public void wither(int id){
        for (int i = 0; i < this.petal_list.size(); i++) {
            if (this.petal_list.get(i).getId() == id){
                this.petal_list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < this.bud_list.size(); i++) {
            if (this.bud_list.get(i).getId() == id){
                this.bud_list.remove(i);
                i--;
            }
        }
    }

    public void colour(){
        for (int i = 0; i < this.bud_list.size(); i++) {
            System.out.println(this.bud_list.get(i).getColor());
        }
    }
}
