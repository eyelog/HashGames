package Models;

import java.util.Objects;

public class DataFull {

    String name;

    public DataFull(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataFull)) return false;
        DataFull dataFull = (DataFull) o;
        return Objects.equals(name, dataFull.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
