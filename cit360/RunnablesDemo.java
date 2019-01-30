package familiarity.review.code;
//These libraries are already imported! They are where we get our classes and methods from
// java.lang.Runnable;
// java.lang.Thread;

public class RunnablesDemo {
    //Prints the name of the main thread, then creates 4 new threads and runs the next class
    //on each one, displaying the name of the thread.
    public static void main(String[] args)
    {
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        Thread t0 = new Thread(new RunnablesDemo().new RunnableCreator());
        Thread t1 = new Thread(new RunnablesDemo().new RunnableCreator());
        Thread t2 = new Thread(new RunnablesDemo().new RunnableCreator());
        Thread t3 = new Thread(new RunnablesDemo().new RunnableCreator());
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        //System.out.println("This shows that it truly is asychronus, as this will read before the threads.");
    }
    private class RunnableCreator implements Runnable{
        @Override
        public void run()
        {
            System.out.println("Next thread name: " + Thread.currentThread().getName());
        }
    }
}
