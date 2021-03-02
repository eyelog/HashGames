package JavaHashPlace;

import Models.NameData;

import java.util.HashMap;
import java.util.Map;

public class JavaHashSandBox {

    public static void main(String[] args) {

        String a = "Name";
        String b = "Name";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        int a1 = 2;
        int b2 = 3;
        System.out.println(Integer.hashCode(a1));
        System.out.println(Integer.hashCode(b2));

        NameData nda = new NameData("Name");
        NameData ndb = new NameData("Name");

        System.out.println(nda.hashCode());
        System.out.println(ndb.hashCode());

        Map<NameData, Integer> map = new HashMap<>();
        map.put(nda, 10);
        map.put(ndb, 12);

        NameData ndc = new NameData("Name");

        System.out.println(map.get(ndc));
    }
}
