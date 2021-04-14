package Models;

public class DogSameHash {

    String name;

    public DogSameHash(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
