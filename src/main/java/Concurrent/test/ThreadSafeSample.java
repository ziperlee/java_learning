package Concurrent.test;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/06/12
 */


public class ThreadSafeSample {
    public int sharedState;
    public void nonSafeAction() {
//        while (sharedState < 100000) {
//            int former = sharedState++;
//            int latter = sharedState;
//            if (former != latter - 1) {
//                System.out.printf("Observed data race, former is " +
//                        former + ", " + "latter is " + latter);
//            }
//        }
        while (sharedState < 100000) {
            synchronized (this) {
                int former = sharedState++;
                int latter = sharedState;
                if (former != latter - 1) {
                    System.out.printf("Observed data race, former is " +
                            former + ", " + "latter is " + latter);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeSample sample = new ThreadSafeSample();
        Thread threadA = new Thread(){
            public void run(){
                sample.nonSafeAction();
            }
        };
        Thread threadB = new Thread(){
            public void run(){
                sample.nonSafeAction();
            }
        };
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
    }
}