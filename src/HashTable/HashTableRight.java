package HashTable;

import JavaHashCollisions.PetWithEqual;
import JavaHashCollisions.PetWithoutEqual;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableRight {

    public static void main(String[] args) {

        Enumeration names;
        PetWithEqual key;

        Hashtable<PetWithEqual, String> hashtable = new Hashtable();

        hashtable.put(new PetWithEqual(1, "1"),"1");
        hashtable.put(new PetWithEqual(1, "1"),"9");
        hashtable.put(new PetWithEqual(2, "2"),"2");
        hashtable.put(new PetWithEqual(3, "3"),"3");
        hashtable.put(new PetWithEqual(4, "4"),"4");


        names = hashtable.keys();
        while(names.hasMoreElements()) {
            key = (PetWithEqual) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}
