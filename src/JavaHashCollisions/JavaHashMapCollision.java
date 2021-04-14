package JavaHashCollisions;

import java.util.HashMap;

public class JavaHashMapCollision {

    public static void main(String[] args) {

        HashMap<PetWithEqual, String> map = new HashMap();
        PetWithEqual p1 = new PetWithEqual(1, "p1");
        PetWithEqual p2 = new PetWithEqual(2, "p2");
        PetWithEqual p3 = new PetWithEqual(3, "p3");
        PetWithEqual p4 = new PetWithEqual(3, "p3");
        PetWithEqual p5 = new PetWithEqual(3, "p4");

        map.put(p1, "Pet1");
        map.put(p2, "Pet2");
        map.put(p3, "Pet3");
        map.put(p4, "Pet4");
        map.put(p5, "Pet5");

        PetWithEqual p6 = new PetWithEqual(3, "p3");

        System.out.println(map.values());
        System.out.println(map.get(p6));
        System.out.println("                                         ");


        HashMap<PetWithoutEqual, String> mapW = new HashMap();
        PetWithoutEqual p1W = new PetWithoutEqual(1, "p1");
        PetWithoutEqual p2W = new PetWithoutEqual(2, "p2");
        PetWithoutEqual p3W = new PetWithoutEqual(3, "p3");
        PetWithoutEqual p4W = new PetWithoutEqual(3, "p3");
        PetWithoutEqual p5W = new PetWithoutEqual(3, "p4");

        mapW.put(p1W, "Pet1");
        mapW.put(p2W, "Pet2");
        mapW.put(p3W, "Pet3");
        mapW.put(p4W, "Pet4");
        mapW.put(p5W, "Pet5");

        PetWithoutEqual p6W = new PetWithoutEqual(3, "p3");

        System.out.println(mapW.values());
        System.out.println(mapW.get(p6W));

    }
}
