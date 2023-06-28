package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(21);
        arrayList.add(1,22);
        System.out.println(arrayList);

        Iterator list = arrayList.iterator();
        while (list.hasNext())
        {
            System.out.println(list.next());
        }
    }
}
