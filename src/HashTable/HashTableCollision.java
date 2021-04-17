package HashTable;

import JavaHashCollisions.PetWithoutEqual;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableCollision {

    public static void main(String[] args) {

        Enumeration names;
        PetWithoutEqual key;

        Hashtable<PetWithoutEqual, String> hashtable = new Hashtable();

        hashtable.put(new PetWithoutEqual(1, "1"),"1");
        hashtable.put(new PetWithoutEqual(1, "1"),"9");
        hashtable.put(new PetWithoutEqual(2, "2"),"2");
        hashtable.put(new PetWithoutEqual(3, "3"),"3");
        hashtable.put(new PetWithoutEqual(4, "4"),"4");


        names = hashtable.keys();
        while(names.hasMoreElements()) {
            key = (PetWithoutEqual) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}
