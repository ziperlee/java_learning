package Datastructure.Enum;

import java.util.Random;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/22
 */

enum Activity { SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODGING, JUMPING, FALLING, FLYING }

public class EnumRandom {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++)
            System.out.print(random(Activity.class) + " ");
    }
}
