package Datastructure.Enum;

import java.text.DateFormat;
import java.util.Date;

/**
 * 允许为 enum 实例编写方法，从而为每个 enum 实例赋予各自不同的行为。要实现常量相关的方法，
 * 你需要为 enum 定义一个或多个 abstract 方法，然后为每个 enum 实例实现该抽象方法
 *
 * @author liwei
 * @createTime 2020/03/22
 */

public enum ConstantSpecificMethod {
    DATE_TIME {
        @Override
        String getInfo() {
            return
                    DateFormat.getDateInstance()
                            .format(new Date());
        }
    },
    CLASSPATH {
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values())
            System.out.println(csm.getInfo());
    }
}
