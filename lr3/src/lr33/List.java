package lr33;

import java.util.Objects;

public class List {
    private int id;
    private String Color;

    public List(int id, String color) {
        this.id = id;
        Color = color;
    }

    public List() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return id == list.id && Objects.equals(Color, list.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Color);
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", Color='" + Color + '\'' +
                '}';
    }
}
