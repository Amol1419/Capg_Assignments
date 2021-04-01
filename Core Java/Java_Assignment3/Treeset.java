import java.util.Set;
import java.util.TreeSet;
class Person implements Comparable<Person> {
    int weight, height;
    String name;
    Person(int weight, int height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }
    public int compareTo(Person p) {
        if (weight > p.weight) {
            return 1;
        } else if (weight < p.weight) {
            return -1;
        } else {
            if (height > p.height) {
                return 1;
            } else if (height < p.height) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
    public class Treeset {
        public static void main(String[] args) {
            Set<Person> set=new TreeSet<Person>();
            Person p1 = new Person(10, 20, "Amol");
            Person p2 = new Person(15, 25, "Krish");
            Person p3 = new Person(14, 19, "Kulshreshtha");

            set.add(p1);
            set.add(p2);
            set.add(p3);

            for(Person p:set){
                System.out.println(p.weight + " "+ p.height +" "+ p.name);
            }

        }
    }
