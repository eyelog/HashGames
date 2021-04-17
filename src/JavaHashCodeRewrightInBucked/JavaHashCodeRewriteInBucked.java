package JavaHashCodeRewrightInBucked;

import java.util.HashMap;
import java.util.Map;

public class JavaHashCodeRewriteInBucked {

    public static void main(String[] args) {

        Map<TestBox, String> map = new HashMap<>();

        map.put(new TestBox(1, "Box1"), "Box1");
        map.put(new TestBox(1, "Box2"), "Box2");

        System.out.println(map.values());
    }
}
