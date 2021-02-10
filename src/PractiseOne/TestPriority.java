package PractiseOne;

import java.util.PriorityQueue;

public class TestPriority {
    public static void main(String[] args) {
        PriorityQueue<String> pq =  new PriorityQueue<>();
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.gc();
        System.err.println("gokul");
        int g = 012;
        System.out.println("Gokul :"+g);
    }
}
