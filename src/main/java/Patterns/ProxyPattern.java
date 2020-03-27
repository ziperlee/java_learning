package Patterns;

/**
 * 代理类包含被代理类，实现部分或全部被代理方法
 * 在结构上，代理模式和桥接模式的区别很简单:代理模式只有一个实现，
 * 而桥接模式有多个实现。在设计模式中被认为是不同的:代理模式用于控制对其实现的访问，
 * 而桥接模式允许您动态更改实现。但是，如果您扩展了“控制对实现的访问”的概念，
 * 那么这两者就可以完美地结合在一起
 *
 * @author liwei
 * @createTime 2020/03/25
 */

interface ProxyBase {
    void f();

    void g();

    void h();
}

class Proxy implements ProxyBase {
    private ProxyBase implementation;

    Proxy() {
        implementation = new Implementation();
    }
    // Pass method calls to the implementation:
    @Override
    public void f() { implementation.f(); }
    @Override
    public void g() { implementation.g(); }
    @Override
    public void h() { implementation.h(); }
}

class Implementation implements ProxyBase {
    public void f() {
        System.out.println("Implementation.f()");
    }

    public void g() {
        System.out.println("Implementation.g()");
    }

    public void h() {
        System.out.println("Implementation.h()");
    }
}

public class ProxyPattern {
    public static void main(String[] args) {
        Proxy p = new Proxy();
        p.f();
        p.g();
        p.h();
    }
}
