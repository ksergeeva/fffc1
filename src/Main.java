import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Сергей","Первый самый первый", 35));
        people.add(new Person("Антон","Второй но не первый",45));
        people.add(new Person("Петр","Третий пятый", 32));
        people.add(new Person("Валерий","Четвертый раз и два",55));
        Comparator<Person> NameComparator = new PersonNameComparator();
        System.out.println(people);

        Collections.sort(people, NameComparator);
        System.out.println(people);

    }
}

