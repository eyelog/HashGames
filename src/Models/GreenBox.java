package Models;

import java.util.Objects;

public class GreenBox {

    int number;
    String name;

    public GreenBox(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals called: " + this + " : " + obj);
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode called: " + number);
        return number;
    }
}
