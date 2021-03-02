package Models;

public class StartA {

    private Long id;
    private String name;

    public StartA(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("Equals called: " + this + " : " + obj);
        StartA other = (StartA)obj;
        return id.equals(other.id) && name.equals(other.name);
    }

    @Override
    public int hashCode(){
        System.out.println("HashCode called: " + this);
        return id.intValue();
    }

    @Override
    public String toString() {
        return "StartA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
