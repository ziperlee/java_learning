package Validating;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/11
 */

/**
 * 动态启用断言，无需运行时指定 -ea
 */
public class LoaderAssertions {
    public static void main(String[] args) {

        ClassLoader.getSystemClassLoader().
                setDefaultAssertionStatus(true);
        new Loaded().go();
    }
}

class Loaded {
    public void go() {
        assert false: "Loaded.go()";
    }
}
