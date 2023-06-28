package cat2;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

public class ThreadPriority {
    public static void main(String[ ] args) {
        Thread t = Thread.currentThread( );
        System.out.println(t);
        System.out.println(t.getName( ) + "  " + t.getPriority());
        t.setPriority(9);
        System.out.println("priority :" +t.getName()+t.getPriority());
        t.setName("Main Thread") ; t.setPriority(9);
        System.out.println(t.getName( ) + "  " + t.getPriority());
        Thread t1 = new Thread( );
        System.out.println(t1);
        Thread t2 = new Thread( );
        System.out.println(t2);
    }
}

