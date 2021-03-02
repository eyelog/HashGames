package JavaReference;

import Models.Dog;

public class ReferenceTest3 {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;
        System.out.println(aDog);
        System.out.println(oldDog);

        foo(aDog);
        // when foo(...) returns, the name of the dog has been changed to "Fifi"
        aDog.getName().equals("Fifi"); // true
        // but it is still the same dog:
        System.out.println(aDog == oldDog); // true

        System.out.println(aDog.getName());
        System.out.println(oldDog.getName());

        System.out.println(aDog);
        System.out.println(oldDog);
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // this changes the name of d to be "Fifi"
        d.setName("Fifi");
    }
}
