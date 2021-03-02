package JavaReference;

import Models.Dog;

public class ReferenceTest4 {

    public static void main(String[] args) {
        Dog f = new Dog("f");
        System.out.println(f);
        changeReference(f); // It won't change the reference!
        modifyReference(f); // It will modify the object that the reference variable "f" refers to!
    }

    public static void changeReference(Dog a) {
        Dog b = new Dog("b");
        a = b;
        System.out.println(a);
    }

    public static void modifyReference(Dog c) {
        c.setName("c");
        System.out.println(c);
    }
}
