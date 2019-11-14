package familiarity.review.code;

import java.util.concurrent.atomic.AtomicInteger;

// java.lang.Thread;

public class RunnablesDemo {
    //Prints the name of the main thread, then creates 4 new threads and runs the next class
    //on each one, displaying the name of the thread.
    public static void main(String[] args)
    {
        //Atomic variable to allow threads to access it all at the same time.
        AtomicInteger counter = new AtomicInteger(5);
        //Trying to use the following integer doesn't work. Program doesn't compile
        //int breaks = 0;
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                Thread.currentThread().setName("Thread 1");
                System.out.println("This is thread " + Thread.currentThread().getName());
                counter.incrementAndGet();
                counter.incrementAndGet();
                //breaks++;
                System.out.println("Current counter: " + counter.get());
            }
        };
        
        Runnable runnable2 = new Runnable(){
            @Override
            public void run() {
                Thread.currentThread().setName("Thread 2");
                System.out.println("This is thread " + Thread.currentThread().getName());
                counter.decrementAndGet();
                System.out.println("Current counter: " + counter.get());
            }
        };
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        //Running both threads at once will show that they can 
        //access it at the same time
        //In this case, Thread t1 will increment the counter variable by 2.
        //Then Thread t2 decrements it. They run at the same time.
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        
    }
}
