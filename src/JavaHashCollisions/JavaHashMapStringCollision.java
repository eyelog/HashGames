package JavaHashCollisions;

import java.util.HashMap;

public class JavaHashMapStringCollision {

    public static void main(String[] args) {

        // В String equals переопределён по умолчанию.

        String a = "Aa";
        String b = "BB";
        String c = "Cc";

        HashMap<String, String> map = new HashMap();

        map.put(a, "put0");
        map.put(b, "put1");
        map.put(c, "put2");

        System.out.println(map.values());
        System.out.println(map.get("BB"));


    }
}
