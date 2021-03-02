package Models;

import java.util.Objects;

public class ContactDefinedHashById {

    int id;
    String name;
    String phone;

    public ContactDefinedHashById(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactOverride)) return false;
        ContactOverride that = (ContactOverride) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
