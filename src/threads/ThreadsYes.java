package threads;

import java.util.Random;

public class ThreadsYes extends Thread {
    private String process;

    public ThreadsYes(String process) {
        this.process = process;
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
            ThreadsYes t = new ThreadsYes(p);
            t.start();
        }
    }
}
