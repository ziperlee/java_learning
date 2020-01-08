package Annotation;

@interface Version {
    int major();

    int minor();
}

@Version(major = 1, minor = 0)
public class Annotation {
    @Version(major = 1, minor = 1)
    private int xyz = 110;

    @Version(major = 1, minor = 0)
    public Annotation() {
    }

    @Version(major = 1, minor = 1)
    public Annotation(int xyz) {
        this.xyz = xyz;
    }

    @Version(major = 1, minor = 0)
    public void printData() {
    }

    @Version(major = 1, minor = 1)
    public void setXyz(int xyz) {

        @Version(major = 1, minor = 2)
        int newValue = xyz;

        this.xyz = xyz;
    }
}

