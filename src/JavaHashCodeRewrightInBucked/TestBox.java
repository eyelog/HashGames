package JavaHashCodeRewrightInBucked;

import java.util.Objects;

public class TestBox {

    int id;
    String name;

    public TestBox(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestBox)) return false;
        TestBox testBox = (TestBox) o;
        return id == testBox.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
