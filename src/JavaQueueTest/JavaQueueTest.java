package JavaQueueTest;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueueTest {

    public static void main(String[] args) {


        Queue<String> qu = new PriorityQueue();

        qu.add("a");
        qu.add("a");
        qu.add("b");
        qu.add("c");
        qu.add("d");

        System.out.println(qu);
        System.out.println(qu.peek());
        System.out.println(qu);
    }
}
