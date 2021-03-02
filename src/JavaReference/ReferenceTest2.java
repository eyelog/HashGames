package JavaReference;

import Models.Dog;

public class ReferenceTest2 {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        // we pass the object to foo
        aDog.getName().equals("Max"); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        aDog.setName("Fifi");
        aDog.getName().equals("Fifi"); // true
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true
        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog.equals(oldDog)); // true

        System.out.println(aDog.getName());
        System.out.println(oldDog.getName());
    }
}
