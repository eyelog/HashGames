package JavaHashNode;

import Models.DataFull;
import Models.DataRandom;
import Models.DataSameHash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashingSetTest {

    public static void main(String[] args) {

        Set<DataFull> filledSet = new HashSet<>();
        for (int i = 0; i < 100; i++){
            filledSet.add(new DataFull("H"+i));
        }

        long startTame = System.nanoTime();
        System.out.println("filledSet -> " + filledSet.contains(new DataFull("H4")));
        System.out.println("filledSet: " + (System.nanoTime() - startTame));

        Set<DataSameHash> emptySet = new HashSet<>();
        for (int i = 0; i < 100; i++){
            emptySet.add(new DataSameHash("H"+i));
        }

        startTame = System.nanoTime();
        System.out.println("sameSet -> " + emptySet.contains(new DataSameHash("H4")));
        System.out.println("sameSet: " + (System.nanoTime() - startTame));
    }
}
