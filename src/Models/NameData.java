package Models;

import java.util.Objects;

public class NameData {
    private String name;

    public NameData(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
////        System.out.println("Equals called: " + this + " : " + o);
//        if (this == o) return true;
//        if (!(o instanceof NameData)) return false;
//        NameData nameData = (NameData) o;
//        return name.equals(nameData.name);
//    }
//
//    @Override
//    public int hashCode() {
////        System.out.println("HashCode called: " + this);
//        return Objects.hash(name);
//    }

//    @Override
//    public String toString() {
//        return "NameData{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
