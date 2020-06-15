package Concurrent;

/**
 * 加锁的是实例对象
 *
 * @author liwei
 * @createTime 2020/06/08
 */

public class SynchronizedCode implements Runnable{
    private int count;

    public SynchronizedCode() {
        count = 0;
    }

    public void run() {
        //同步代码块中锁定的是当前实例对象
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedCode syncThread = new SynchronizedCode();
        //注意此刻是一个同一个实例对象
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
    }

}


