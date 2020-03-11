package InnerClass;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/10
 */
class Wrapping {
    private int i;
    public Wrapping(int x) { i = x; }
    public int value() { return i; }
}

public class AnonymousInnerClassWithConstructor {
    public Wrapping wrapping(int x) {
        // Base constructor call:
        return new Wrapping(x) { // [1]
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // [2]
    }
    public static void main(String[] args) {
        AnonymousInnerClassWithConstructor p = new AnonymousInnerClassWithConstructor();
        Wrapping w = p.wrapping(10);
        System.out.println(w.value());
    }

}
