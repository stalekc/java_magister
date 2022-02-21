package lr33;

import java.util.Objects;

public class Petal {
    private String color;
    private int id;

    public Petal(String color, int id) {
        this.color = color;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Petal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Petal petal = (Petal) o;
        return id == petal.id && color.equals(petal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, id);
    }

    @Override
    public String toString() {
        return "Petal{" +
                "color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}
