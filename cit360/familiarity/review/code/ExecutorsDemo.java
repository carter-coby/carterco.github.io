package familiarity.review.code;
//These packages must be imported for Executors!
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorsDemo{
    public static void main(String[] args)
    {
        ExecutorService executorpool = Executors.newFixedThreadPool(10);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runner runner = new ExecutorsDemo().new Runner();
        Runner2 runner2 = new ExecutorsDemo().new Runner2();
        executorpool.execute(runner2);
        executorpool.execute(runner2);
        executorpool.execute(runner2);
        executorpool.execute(runner2);
        executorpool.execute(runner2);
        executor.execute(runner);
        executor.execute(runner);
        executor.shutdown();
        executorpool.shutdown();
    }
    private class Runner implements Runnable{
        public void run()
        {
            System.out.println("SINGLE THREAD: " + Thread.currentThread().getName());
        }
    }
    private class Runner2 implements Runnable{
                public void run()
        {
            System.out.println("POOL: " + Thread.currentThread().getName());
        }
    }
}
