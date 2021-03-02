package Models;

public class Pet {

    private Long id;
    private String name;
    private Boolean check;

    public Pet(Long id, String name, Boolean check) {
        this.id = id;
        this.name = name;
        this.check = check;
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode called: " + this);
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals called: " + this + " : " + obj);
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", check='" + check + '\'' +
                '}';
    }
}
