package FunctionalProgramming.Lambda;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/11
 */

interface IntCall {
    int call(int arg);
}

/**
 * 递归，通过静态变量
 */
public class RecursiveFactorial {
    static IntCall fact;
    public static void main(String[] args) {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for(int i = 0; i <= 10; i++)
            System.out.println(fact.call(i));
    }
}

/**
 * 递归，通过实例变量
 */
//public class RecursiveFibonacci {
//    IntCall fib;
//
//    RecursiveFibonacci() {
//        fib = n -> n == 0 ? 0 :
//                n == 1 ? 1 :
//                        fib.call(n - 1) + fib.call(n - 2);
//    }
//
//    int fibonacci(int n) { return fib.call(n); }
//
//    public static void main(String[] args) {
//        RecursiveFibonacci rf = new RecursiveFibonacci();
//        for(int i = 0; i <= 10; i++)
//            System.out.println(rf.fibonacci(i));
//    }
//}

