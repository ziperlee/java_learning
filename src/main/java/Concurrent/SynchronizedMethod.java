package Concurrent;

/**
 * 加锁的是类对象
 *
 * @author liwei
 * @createTime 2020/06/08
 */

public class SynchronizedMethod implements Runnable{
    private static int count;

    public SynchronizedMethod() {
        count = 0;
    }

    public synchronized static void method() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        method();
    }

    public static void main(String[] args) {
        SynchronizedMethod mThread1 = new SynchronizedMethod();
        SynchronizedMethod mThread2 = new SynchronizedMethod();
        Thread thread1 = new Thread(mThread1, "Thread1");
        Thread thread2 = new Thread(mThread2, "Thread2");
        thread1.start();
        thread2.start();
    }
}
