package JavaHashCollisions;

import java.util.HashSet;
import java.util.Set;

public class JavaHashSetCollisionOverload {

    public static void main(String[] args) {

        Set<PetWithEqual> setSingleBucket = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            setSingleBucket.add(new PetWithEqual(1, "set" + i));
        }

        long time = System.nanoTime();
        System.out.println("setSingleBucket: " + setSingleBucket.contains(new PetWithEqual(1, "set9999")));
        System.out.println("time: " + (System.nanoTime() - time));
        System.out.println("                                   ");


        Set<PetWithEqual> setSeparateBucket = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            setSeparateBucket.add(new PetWithEqual(i, "set" + i));
        }

        time = System.nanoTime();
        System.out.println("setSeparateBucked: " + setSeparateBucket.contains(new PetWithEqual(9999, "set9999")));
        System.out.println("time: " + (System.nanoTime() - time));
    }
}
