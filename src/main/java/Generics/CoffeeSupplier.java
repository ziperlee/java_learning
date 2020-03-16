package Generics;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 参数化的 Supplier 接口确保 get() 返回值是参数的类型。
 * CoffeeSupplier 同时还实现了 Iterable 接口，所以能用于 for-in 语句。
 * 不过，它还需要知道何时终止循环，这正是第二个构造函数的作用
 *
 * @author liwei
 * @createTime 2020/03/16
 */

public class CoffeeSupplier
        implements Supplier<Coffee>, Iterable<Coffee> {
    private Class<?>[] types = { Latte.class, Mocha.class,
            Cappuccino.class, Americano.class, Breve.class };
    private static Random rand = new Random(47);

    public CoffeeSupplier() {}
    // For iteration:
    private int size = 0;
    public CoffeeSupplier(int sz) { size = sz; }

    @Override
    public Coffee get() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() { return count > 0; }
        @Override
        public Coffee next() {
            count--;
            return CoffeeSupplier.this.get();
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        Stream.generate(new CoffeeSupplier())
                .limit(5)
                .forEach(System.out::println);
        for (Coffee c : new CoffeeSupplier(5)) {
            System.out.println(c);
        }
    }
}


class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Latte extends Coffee {}

class Mocha extends Coffee {}

class Cappuccino extends Coffee {}

class Americano extends Coffee {}

class Breve extends Coffee {}