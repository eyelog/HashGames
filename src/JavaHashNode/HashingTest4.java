package JavaHashNode;

import Models.DataEmpty;
import Models.DataFull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashingTest4 {

    public static void main(String[] args) {

        Set<DataEmpty> emptySet = new HashSet<>();
        for (int i = 0; i < 4; i++){
            emptySet.add(new DataEmpty("Name"));
        }

        for(DataEmpty emp: emptySet){
            System.out.println("Empty Set: " + emp.getName() + ", hash: " + emp.hashCode());
        }

        Map<DataEmpty, String> emptyMap = new HashMap<>();
        for (int i = 0; i < 4; i++){
            emptyMap.put(new DataEmpty("Name"), "TestName");
        }

        System.out.println("Empty HashMap: " + emptyMap);

        Set<DataFull> fullSet = new HashSet<>();
        for (int i = 0; i < 4; i++){
            fullSet.add(new DataFull("Name"));
        }

        for(DataFull emp: fullSet){
            System.out.println("Full Set: " + emp.getName() + ", hash: " + emp.hashCode());
        }

        Map<DataFull, String> fullMap = new HashMap<>();
        for (int i = 0; i < 4; i++){
            fullMap.put(new DataFull("Name"), "TestName");
        }

        System.out.println("Full HashMap: " + fullMap);

    }
}
