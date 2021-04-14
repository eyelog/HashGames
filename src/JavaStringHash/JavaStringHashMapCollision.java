package JavaStringHash;

import java.util.HashMap;

public class JavaStringHashMapCollision {

    public static void main(String[] args) {

        String a = "Aa";
        String b = "BB";

        HashMap<String, String> hm = new HashMap<>();
        hm.put(a, "testA");
        hm.put(b, "testB");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(hm.get(a));
        System.out.println(hm.get(b));

    }
}
