package lr34;

public class Visitor {
    private int id;

    public Visitor(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                '}';
    }
}
