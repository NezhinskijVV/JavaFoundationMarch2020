package threads.lecture2;

import lombok.SneakyThrows;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
//        Object obj = new Object();
//
//        synchronized (new Object()) {
//            synchronized (obj) {
//                obj.wait();
//            }
//        }

//        ThreadPractice threadPractice = new ThreadPractice();
//        MyThread thread1 = new MyThread(1, threadPractice);
//        MyThread thread2 = new MyThread(2, threadPractice);
//        MyThread thread3 = new MyThread(3, threadPractice);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();


//        Class<ThreadPractice> threadPracticeClass = ThreadPractice.class;
//        synchronized (threadPracticeClass){
//            threadPracticeClass.wait();
//        }

        Thread.currentThread().join();

    }

    @SneakyThrows
    public synchronized void printRun(int num) {
        System.out.println("Begin " + num);
        this.wait(3000);
//        Thread.sleep(3000);
        System.out.println("End " + num);
    }
}

//HW:
//1. Singletone (private constructor) + enum
//2. Deadlock
//3. Synchronized volatile
//4* Паттерн фабрика

// ко 2 мая надо сдать все домашки
