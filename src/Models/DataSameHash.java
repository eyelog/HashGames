package Models;

import java.util.Objects;

public class DataSameHash {

    String name;

    public DataSameHash(String name) {
        this.name = name;
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
        return 5;
    }
}
