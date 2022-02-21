package lr33;

import java.util.Objects;

public class Bud {
    private String color;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bud(String color, int id) {
        this.color = color;
        this.id = id;
    }

    public Bud() {
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
        Bud bud = (Bud) o;
        return id == bud.id && Objects.equals(color, bud.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, id);
    }

    @Override
    public String toString() {
        return "Bud{" +
                "color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}
