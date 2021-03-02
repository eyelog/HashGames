package JavaHashNode;

import Models.DataFull;
import Models.DataRandom;
import Models.DataSameHash;

import java.util.HashMap;
import java.util.Map;

public class HashingTest3 {

    public static void main(String[] args) {

        Map<DataFull, DataRandom> filledMap = new HashMap<>();
        for (int i = 0; i < 100; i++){
            filledMap.put(new DataFull("H"+i), new DataRandom());
        }

        long startTame = System.nanoTime();
        System.out.println(filledMap.get(new DataFull("H97")));
        System.out.println(System.nanoTime() - startTame);

        Map<DataSameHash, DataRandom> emptyMap = new HashMap<>();
        for (int i = 0; i < 100; i++){
            emptyMap.put(new DataSameHash("H"+i), new DataRandom());
        }

        startTame = System.nanoTime();
        System.out.println(emptyMap.get(new DataSameHash("H97")));
        System.out.println(System.nanoTime() - startTame);
    }
}
