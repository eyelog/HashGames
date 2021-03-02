package JavaHashMap;

import Models.Pet;

import java.util.HashMap;

public class JavaHashMapEngine {
    public static void main(String[] args) {

        HashMap<String, Pet> hm = new HashMap<>();

        hm.put("first", new Pet(1L, "Name1", true));
        System.out.println("HashMap #1: " + hm.toString());

        hm.put("second", new Pet(1L, "Name1", true));
        System.out.println("HashMap #2: " + hm.toString());

        System.out.println("Equals " + hm.get("first").equals(hm.get("second")));

        hm.put("third", new Pet(3L, "Name3", true));
        System.out.println("HashMap #3: " + hm.toString());

    }
}
