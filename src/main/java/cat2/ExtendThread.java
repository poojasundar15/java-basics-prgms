package cat2;

public class ExtendThread extends Thread {
    private String word;
    private long delay;
    public ExtendThread(String str, int d) {

        word = str; delay = d;
    }
    public void run( ) {
        for(; ;) {
            System.out.print(word+ "  ");
            try {
                Thread.sleep(delay);
            }catch(InterruptedException e) {

            }
        }//for
    }//run
    public static void main(String[ ] args) {
        ExtendThread t1 = new ExtendThread("Java", 5);
        ExtendThread t2 = new ExtendThread( "Programming", 5);
        t1.start( );  t2.start( );
 	/*	new Thread11("Java", 50).start( );
		new Thread11("Programming", 50).start( );	*/
    }
}
