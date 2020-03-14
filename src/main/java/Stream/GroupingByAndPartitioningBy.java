package Stream;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/14
 */

public class GroupingByAndPartitioningBy {
    private static class Person {
        public int no;
        private String name;
        private int age;

        public Person(int no, String name) {
            this.no = no;
            this.name = name;
            age = no % 10;
        }

        public String getName() {
            System.out.println(name);
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    private static class PersonSupplier implements Supplier<Person> {
        private int index = 0;
        private Random random = new Random();

        @Override
        public Person get() {
            return new Person(index++, "StormTestUser" + index);
        }
    }

    public static void groupingBy() {
        Map<Integer, List<Person>> personGroups = Stream.generate(new PersonSupplier()).
                limit(100).
                collect(Collectors.groupingBy(Person::getAge));
        Iterator it = personGroups.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, List<Person>> persons = (Map.Entry) it.next();
            System.out.println("Age " + persons.getKey() + " = " + persons.getValue().size());
        }
    }

    public static void partitioningBy() {
        Map<Boolean, List<Person>> children = Stream.generate(new PersonSupplier()).
                limit(100).collect(Collectors.partitioningBy(p -> p.getAge() < 18));
        System.out.println("Children number: " + children.get(true).size());
        System.out.println("Adult number: " + children.get(false).size());
    }

    public static void main(String[] args) {
        groupingBy();
        partitioningBy();
    }
}
