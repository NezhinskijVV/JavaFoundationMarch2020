package threads.lecture1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Printer extends Thread {
    private String message;
    private long mills;


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(mills);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }

    }
}
