import java.util.Comparator;


public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if  (o1.getSurname().split("[\\s]+").length < o2.getSurname().split("[\\s]+").length) {
            return 1;
        }
        if  (o1.getSurname().split("[\\s]+").length > o2.getSurname().split("[\\s]+").length) {
            return -1;
        }

        if (o1.setAge() > o2.setAge()) {
            return -1;
        }
        if (o1.setAge() < o2.setAge()) {
            return 1;
        }

        return 0;

    }
}

