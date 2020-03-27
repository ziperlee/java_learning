package Patterns;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/25
 */


interface StateBase {
    void f();

    void g();

    void h();

    void changeImp(StateBase newImp);
}

class State implements StateBase {
    private StateBase implementation;

    State(StateBase imp) {
        implementation = imp;
    }

    @Override
    public void changeImp(StateBase newImp) {
        implementation = newImp;
    }// Pass method calls to the implementation:

    @Override
    public void f() {
        implementation.f();
    }

    @Override
    public void g() {
        implementation.g();
    }

    @Override

    public void h() {
        implementation.h();
    }
}

class Implementation1 implements StateBase {
    @Override
    public void f() {
        System.out.println("Implementation1.f()");
    }

    @Override
    public void g() {
        System.out.println("Implementation1.g()");
    }

    @Override
    public void h() {
        System.out.println("Implementation1.h()");
    }

    @Override
    public void changeImp(StateBase newImp) {
    }
}

class Implementation2 implements StateBase {
    @Override
    public void f() {
        System.out.println("Implementation2.f()");
    }

    @Override
    public void g() {
        System.out.println("Implementation2.g()");
    }

    @Override
    public void h() {
        System.out.println("Implementation2.h()");
    }

    @Override
    public void changeImp(StateBase newImp) {
    }
}

public class StatePattern {
    static void test(StateBase b) {
        b.f();
        b.g();
        b.h();
    }

    public static void main(String[] args) {
        StateBase b = new State(new Implementation1());
        test(b);
        b.changeImp(new Implementation2());
        test(b);
    }
}
