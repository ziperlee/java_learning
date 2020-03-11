package InnerClass;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/10
 */
// 包访问权限，一个java文件只能有一个public类
class Contents {
    private int i = 11;

    public int value() {
        return i;
    }
}

public class AnonymousInnerClass {

    public Contents contents() {
        return new Contents() { // Insert class definition
            private int i = 12;

            @Override
            public int value() {
                return i+1;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        AnonymousInnerClass p = new AnonymousInnerClass();
        Contents c = p.contents();
        System.out.println(c.value());
    }

}

// 等价于
class Parcel7b {
    class MyContents extends Contents {
        private int i = 11;
        @Override
        public int value() { return i; }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
