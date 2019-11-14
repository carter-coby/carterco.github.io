package familiarity.review.code;
import java.util.concurrent.atomic.AtomicInteger;
//java.lang.Thread


/**
 *
 * @author cobyc
 */
//I ran this in Netbeans, and it asked me to select which main to run.
//The selection will then run based on what you select
public class Threads {
    //The main thread is created whenever a program starts.
    public static void main(String[] args)
    {
        //1.) Play around with Threads. Change names, create them, etc.
        System.out.println("Main thread created!");
        System.out.println(Thread.currentThread().getName());
        Thread t0 = new Thread();
        System.out.println(t0.getName() + " created!");
        String oldname = t0.getName();
        t0.setName("Test Thread");
        System.out.println(oldname + " renamed to " + t0.getName());
    }
}

class MyExtension extends Thread{
    public void run()
    {
        Thread.currentThread().setName("MyExtension Thread");
        System.out.println(Thread.currentThread().getName() + " has started running");
    }
    public static void main(String[] args)
    {
        MyExtension ext = new MyExtension();
        ext.start();
    }
}


