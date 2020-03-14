package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/14
 */

public class Sort {
    private static class Person {
        public int no;
        private String name;

        public Person(int no, String name) {
            this.no = no;
            this.name = name;
        }

        public String getName() {
            System.out.println(name);
            return name;
        }
    }

    public static void sort1() {
//        先全量排序
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List personList2 = persons.stream().
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).limit(2).map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(personList2);
        System.out.println();
    }

    public static void sort2() {
//        只会比较前两个
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List personList2 = persons.stream().limit(2).
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(personList2);
    }

    public static void main(String[] args) {
        sort1();
        sort2();
    }
}
