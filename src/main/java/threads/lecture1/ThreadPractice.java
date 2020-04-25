package threads.lecture1;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
////            for (int j = 0; j < 1_000_000_000L; j++) {
////
////            }
//            Thread.sleep(2500);
//            System.out.println("1");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1500);
//            System.out.println("2");
//        }


//        for (int i = 0; i < 10; i++) {
//            System.out.println("0");
//        }
//
//
//        Printer printer1 = new Printer("1", 2500L);
//        Printer printer2 = new Printer("2", 1500L);
//        printer1.start();
//        printer2.start();
//
//        printer2.join();
//        printer1.join();
//
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//            System.out.println(3);
//        }


        // 2 способа создания потока
        Thread threadThread = new Printer("0", 1);
        threadThread.start();

        Runnable runnablePractice = new RunnablePractice();
        Thread threadRunnable = new Thread(runnablePractice);
        threadRunnable.start();

//        new Thread(new RunnablePractice()).start();


        Thread threadAnonymously = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });


        Thread threadLyambda = new Thread(() -> System.out.println("lyambda"));
        new Thread(() -> System.out.println("lyambda")).start();

    }
}

//  ----------------------------------------------------
//  2 1 2 2 1 ......




