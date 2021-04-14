package JavaHashCollisions;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapCollisionOverload {

    public static void main(String[] args) {

        Map<PetWithEqual, String> petSingleBucket = new HashMap<>();

        for (int i = 0; i < 10000; i++) {
            petSingleBucket.put(new PetWithEqual(1, "Pet" + i), "Pet" + i);
        }

        long time = System.nanoTime();
        System.out.println(petSingleBucket.get(new PetWithEqual(1, "Pet9999")));
        System.out.println("petSingleBucket: " + (System.nanoTime() - time));
        System.out.println("                                               ");

        Map<PetWithEqual, String> petSeparateBucked = new HashMap<>();

        for (int i = 0; i < 10000; i++) {
            petSeparateBucked.put(new PetWithEqual(i, "Pet" + i), "Pet" + i);
        }

        time = System.nanoTime();
        System.out.println(petSeparateBucked.get(new PetWithEqual(9999, "Pet9999")));
        System.out.println("petSeparateBucked: " + (System.nanoTime() - time));
    }
}
