package Java;

import Models.PersonEmpty;

public class EmptyObject {

    public static void main(String[] args) {

        PersonEmpty sally = new PersonEmpty();

        System.out.println(sally);
        System.out.println(sally.hashCode());
        System.out.println(Integer.toHexString(sally.hashCode()));
    }
}
