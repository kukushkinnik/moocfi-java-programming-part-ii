import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private List<Person> listOfEmployees;

    public Employees() {
        this.listOfEmployees = new ArrayList<>();
    }

    public void add(Person person) {
        this.listOfEmployees.add(person);
    }


    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iteator = peopleToAdd.iterator();
        while(iteator.hasNext()) {
            this.listOfEmployees.add(iteator.next());
        }
    }

    public void print() {
        Iterator<Person> iterator = this.listOfEmployees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.listOfEmployees.iterator();

        while(iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.listOfEmployees.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
