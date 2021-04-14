package JavaHashCollisions;

import java.util.HashSet;
import java.util.Set;

public class JavaHashSetCollision {

    public static void main(String[] args) {

        Set<PetWithEqual> set = new HashSet();
        PetWithEqual p1 = new PetWithEqual(1, "p1");
        PetWithEqual p2 = new PetWithEqual(2, "p2");
        PetWithEqual p3 = new PetWithEqual(3, "p3");
        PetWithEqual p4 = new PetWithEqual(3, "p3");
        PetWithEqual p5 = new PetWithEqual(3, "p4");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (PetWithEqual petWithEqual : set) {
            System.out.println(petWithEqual.toString());
        }


        Set<PetWithoutEqual> setW = new HashSet();
        PetWithoutEqual p1W = new PetWithoutEqual(1, "p1");
        PetWithoutEqual p2W = new PetWithoutEqual(2, "p2");
        PetWithoutEqual p3W = new PetWithoutEqual(3, "p3");
        PetWithoutEqual p4W = new PetWithoutEqual(3, "p3");
        PetWithoutEqual p5W = new PetWithoutEqual(3, "p4");

        setW.add(p1W);
        setW.add(p2W);
        setW.add(p3W);
        setW.add(p4W);
        setW.add(p5W);

        for (PetWithoutEqual petWithoutEqual : setW) {
            System.out.println(petWithoutEqual.toString());
        }
    }
}
