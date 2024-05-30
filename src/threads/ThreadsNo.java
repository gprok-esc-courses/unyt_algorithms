package threads;

import java.util.Random;

public class ThreadsNo {
    public void counter(String process) throws InterruptedException {
        Random rnd = new Random();
        for(int i = 0; i < 5; i ++) {
            System.out.println(process + ", " + i);
            Thread.sleep(rnd.nextInt(5000));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String [] processes = {"A", "B", "C", "D", "E"};

        for(String p : processes) {
            ThreadsNo t = new ThreadsNo();
            t.counter(p);
        }
    }
}
