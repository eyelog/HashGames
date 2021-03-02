package JavaReference;

import Models.Dog;

public class ReferenceTest {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        System.out.println(aDog);
        System.out.println(oldDog);

        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true
        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog.equals(oldDog)); // true

        System.out.println(aDog.getName());
        System.out.println(oldDog.getName());

        System.out.println(aDog);
        System.out.println(oldDog);
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
    }
}
