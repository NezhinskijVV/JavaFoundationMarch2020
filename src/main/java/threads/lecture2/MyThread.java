package threads.lecture2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyThread extends Thread {
    private int num;
    private ThreadPractice threadPractice;


    @Override
    public void run() {
        threadPractice.printRun(num);
    }
}
