package JavaHashCollisions;

public class PetWithEqual {

    int id;
    String name;

    public PetWithEqual(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PetWithEqual)) return false;
        PetWithEqual that = (PetWithEqual) o;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "PetWithEqual{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
