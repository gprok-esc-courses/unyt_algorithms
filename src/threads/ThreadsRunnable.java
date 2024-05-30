package threads;

import java.util.Random;

public class ThreadsRunnable implements Runnable {
    private String process;
    private Thread thread;

    public ThreadsRunnable(String process) {
        this.process = process;
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        Random rnd = new Random();
        for(int i = 0; i < 5; i ++) {
            System.out.println(process + ", " + i);
            try {
                Thread.sleep(rnd.nextInt(5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        String [] processes = {"A", "B", "C", "D", "E"};

        for(String p : processes) {
            ThreadsRunnable t = new ThreadsRunnable(p);
            t.start();
        }
    }
}
