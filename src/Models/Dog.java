package Models;

public class Dog {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals called");
        return super.equals(obj);
    }
}
