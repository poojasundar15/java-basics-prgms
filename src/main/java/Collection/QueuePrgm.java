package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePrgm {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>(Arrays.asList("Pooja","Sundar","Rajan"));

        Iterator i = queue.iterator();
        System.out.println("KDJBHFI"+i.next());
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
