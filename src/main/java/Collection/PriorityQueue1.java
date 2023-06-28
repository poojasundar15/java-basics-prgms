package Collection;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(1221,33,545,44));

        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(974,325,54,4));

        for (int i : queue)
        {
            System.out.println(i);
        }

        for (Integer j : queue1)
        {
            System.out.println(j);
        }





    }
}
