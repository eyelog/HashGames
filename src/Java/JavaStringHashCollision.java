package Java;

import java.util.Objects;

public class JavaStringHashCollision {

    public static void main(String[] args) {

        String a = "I have a common prefixDB";
        String b = "I have a common prefixCa";
        String c = "Aa";
        String d = "BB";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(Objects.hashCode(a));
        System.out.println(Objects.hashCode(b));
        System.out.println(Objects.hashCode(c));
        System.out.println(Objects.hashCode(d));
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

    }
}
