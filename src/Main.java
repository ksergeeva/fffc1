import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Сергей","Первый", 35));
        people.add(new Person("Антон","Второй",27));
        people.add(new Person("Петр","Третий-Пятый", 32));
        people.add(new Person("Валерий","Четвертый",59));
        Comparator NameComparator = new PersonNameComparator();
        System.out.println(people);

        Collections.sort(people,NameComparator);
        System.out.println(people);
    }
}
