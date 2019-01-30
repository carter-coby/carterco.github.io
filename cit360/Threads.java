package familiarity.review.code;
//No imports necessary!
//java.lang.Thread


/**
 *
 * @author cobyc
 */
public class Threads {
    //The main thread is created whenever a program starts.
    public static void main(String[] args)
    {
        System.out.println("Main thread created!");
        System.out.println(Thread.currentThread().getName());
        Thread t0 = new Thread();
        System.out.println(t0.getName() + " created!");
        String oldname = t0.getName();
        t0.setName("Test Thread");
        System.out.println(oldname + " renamed to " + t0.getName());
        //t0.
    }
}


