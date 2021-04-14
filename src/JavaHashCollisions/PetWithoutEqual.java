package JavaHashCollisions;

public class PetWithoutEqual {

    int id;
    String name;

    public PetWithoutEqual(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "PetWithoutEqual{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
