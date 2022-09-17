import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Сергей","Первый самый первый", 35));
        people.add(new Person("Антон","Второй но не первый",45));
        people.add(new Person("Петр","Третий пятый", 32));
        people.add(new Person("Валерий","Четвертый раз и два",55));
        people.add(new Person("Александр", "Шестой перед седьмым", 17));
        people.add(new Person("Павел", "Седьмой а мог быть восьмой", 14));
        System.out.println(people);
        Predicate<Person> condition = Person -> Person.getAge() < 18;
        people.removeIf(condition);


        people.sort((o1, o2) -> {
            if  (o1.getSurname().split("[\\s]+").length < o2.getSurname().split("[\\s]+").length) {
                return 1;
            }
            if  (o1.getSurname().split("[\\s]+").length > o2.getSurname().split("[\\s]+").length) {
                return -1;
            }

            if (o1.getAge() > o2.getAge()) {
                return -1;
            }
            if (o1.getAge() < o2.getAge()) {
                return 1;
            }

            return 0;
        });

        System.out.println(people);


    }

}

