package JavaHashMap;

import Models.ContactDefinedHashById;
import Models.ContactEmpty;
import Models.ContactOverride;

import java.util.HashMap;

public class HashMapBrokenKey {

    public static void main(String[] args) {

        // When nothing overriden
        HashMap<ContactEmpty, String> hmEmpty = new HashMap<>();
        ContactEmpty contactEmpty = new ContactEmpty(1, "Name", "101");
        hmEmpty.put(contactEmpty, "test");

        System.out.println("Take the empty object: " + hmEmpty.get(contactEmpty));

        contactEmpty.setPhone("102");
        System.out.println("Take the empty object: " + hmEmpty.get(contactEmpty));

        contactEmpty.setPhone("101");
        System.out.println("Take the empty object: " + hmEmpty.get(contactEmpty));
        System.out.println("                       ");



        // When all overriden by default
        HashMap<ContactOverride, String> hmOverride = new HashMap<>();
        ContactOverride contactOverride = new ContactOverride(1, "Name", "101");
        hmOverride.put(contactOverride, "test");

        System.out.println("Take the override object: " + hmOverride.get(contactOverride));

        contactOverride.setPhone("102");
        System.out.println("Take the override object: " + hmOverride.get(contactOverride));
        System.out.println("Take the override object: " + hmOverride.get(new ContactOverride(1, "Name", "101")));

        contactOverride.setPhone("101");
        System.out.println("Take the override object: " + hmOverride.get(contactOverride));
        System.out.println("                       ");



        // When all overriden and hashCode counting only by id
        HashMap<ContactDefinedHashById, String> hmById = new HashMap<>();
        ContactDefinedHashById contactDefinedHashById = new ContactDefinedHashById(1, "Name", "101");
        hmById.put(contactDefinedHashById, "test");

        System.out.println("Take the defined object: " + hmById.get(contactDefinedHashById));

        contactDefinedHashById.setPhone("102");
        contactDefinedHashById.setPhone("102");
        System.out.println("Take the defined object: " + hmById.get(contactDefinedHashById));

        contactDefinedHashById.setPhone("101");
        System.out.println("Take the defined object: " + hmById.get(contactDefinedHashById));
    }
}
