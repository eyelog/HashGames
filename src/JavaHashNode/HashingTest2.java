package JavaHashNode;

import Models.DataKey;

import java.util.HashMap;
import java.util.Map;

public class HashingTest2 {

    public static void main(String[] args) {

        Map<DataKey, Integer> hm = getAllData();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Some name");
        System.out.println(dk.hashCode());

        Integer value = hm.get(dk);

        System.out.println(value);
    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();
        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Some name");
        System.out.println(dk.hashCode());
        hm.put(dk, 10);
        dk = new DataKey();
        dk.setId(1);
        dk.setName("Some name");
        System.out.println(dk.hashCode());
        hm.put(dk, 11);
        return hm;
    }
}
