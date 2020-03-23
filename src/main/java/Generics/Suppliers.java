package Generics;

/**
 * 此类包含使用生成器填充 Collection 的工具方法
 *
 * create() 为你创建一个新的 Collection 子类型，
 * 而 fill() 的第一个版本将元素放入 Collection 的现有子类型中。
 * 请注意，还会返回传入的容器的确切类型，因此不会丢失类型信息。
 *
 * 前两种方法一般都受约束，只能与 Collection 子类型一起使用。
 * fill() 的第二个版本适用于任何类型的 holder 。
 * 它需要一个附加参数：未绑定方法引用 adder. fill() ，
 * 使用辅助潜在类型来使其与任何具有添加元素方法的 holder 类型一起使用。
 * 因为此未绑定方法 adder 必须带有一个参数（要添加到 holder 的元素），
 * 所以 adder 必须是 BiConsumer <H，A> ，其中 H 是要绑定到的 holder 对象的类型，
 * 而 A 是要被添加的绑定元素类型。
 * 对 accept() 的调用将使用参数 a 调用对象 holder 上的未绑定方法 holder。
 *
 * @author liwei
 * @createTime 2020/03/19
 */

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Suppliers {
    // Create a collection and fill it:
    public static <T, C extends Collection<T>> C
    create(Supplier<C> factory, Supplier<T> gen, int n) {
        return Stream.generate(gen)
                .limit(n)
                .collect(factory, C::add, C::addAll);
    }

    // Fill an existing collection:
    public static <T, C extends Collection<T>>
    C fill(C coll, Supplier<T> gen, int n) {
        Stream.generate(gen)
                .limit(n)
                .forEach(coll::add);
        return coll;
    }

    // Use an unbound method reference to
    // produce a more general method:
    public static <H, A> H fill(H holder,
                                BiConsumer<H, A> adder, Supplier<A> gen, int n) {
        Stream.generate(gen)
                .limit(n)
                .forEach(a -> adder.accept(holder, a));
        return holder;
    }
}