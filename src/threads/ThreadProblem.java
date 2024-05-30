package threads;

import java.util.ArrayList;

public class ThreadProblem extends Thread {


    @Override
    public void run() {
        System.out.println("Updating counter ...");

        ThreadProblem.increaseCounter();

        System.out.println("Counter updated ...");
    }

    public static synchronized void increaseCounter() {
        int x = Counter.counter;
        x++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Counter.counter = x;
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<ThreadProblem> threadsList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            ThreadProblem tp = new ThreadProblem();
            threadsList.add(tp);
            tp.start();
        }
        for(ThreadProblem tp : threadsList) {
            tp.join();
        }


        System.out.println("Counter: " + Counter.counter);
    }
}

class Counter {
    public static int counter = 0;
}
