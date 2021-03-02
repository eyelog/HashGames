package Java;

import Models.MysteriousOne;

public class ApplyHashCode {

    public static void main(String[] args) {

        MysteriousOne first = new MysteriousOne();
        MysteriousOne second = new MysteriousOne();

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("First: " + first.hashCode());
        System.out.println("Second: " + second.hashCode());

        int sup = 0xAAABBB;
        System.out.println(sup);
    }
}
