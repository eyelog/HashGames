package JavaArrayList;

import Models.DataEmpty;
import Models.DataFull;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        // When equals is not overrided
        ArrayList<DataEmpty> dataEmpties = new ArrayList<>();
        DataEmpty dataEmpty1 = new DataEmpty("name");
        DataEmpty dataEmpty2 = new DataEmpty("name");
        DataEmpty dataEmpty3 = new DataEmpty("name");

        dataEmpties.add(dataEmpty1);
        dataEmpties.add(dataEmpty2);

        System.out.println("empty size " + dataEmpties.size());
        System.out.println("empty contains " + dataEmpties.contains(dataEmpty3));
        System.out.println("empty index " + dataEmpties.indexOf(dataEmpty3));

        dataEmpties.remove(dataEmpty3);
        System.out.println("empty size " + dataEmpties.size());


        // When equals is overrided
        System.out.println("                           ");
        ArrayList<DataFull> dataFulls = new ArrayList<>();
        DataFull dataFull1 = new DataFull("name");
        DataFull dataFull2 = new DataFull("name");
        DataFull dataFull3 = new DataFull("name");

        dataFulls.add(dataFull1);
        dataFulls.add(dataFull2);

        System.out.println("full size " + dataFulls.size());
        System.out.println("full contains " + dataFulls.contains(dataFull3));
        System.out.println("full index " + dataFulls.indexOf(dataFull3));

        dataFulls.remove(dataFull3);
        System.out.println("full size " + dataFulls.size());
    }
}
