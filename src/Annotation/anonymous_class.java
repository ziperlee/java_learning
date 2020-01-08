package Annotation;

abstract class People {
    abstract void speak();
}

class AnonymousClass {
    public static void main(final String[] args) {
        new People() {
            String msg = "test";

            @Override
            void speak() {
                System.out.println(msg);
            }
        }.speak();
    }
}
