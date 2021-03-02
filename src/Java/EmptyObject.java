package Java;

import Models.Person;

public class EmptyObject {

    public static void main(String[] args) {

        Person sally = new Person();

        System.out.println(sally);
        System.out.println(sally.hashCode());
        System.out.println(Integer.toHexString(sally.hashCode()));
    }
}
