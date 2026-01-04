import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(); 

        people.add(new Employee("Odi", "Hedgehog", "Manager", 27045.78));
        people.add(new Student("Hobok", "Kit", 2.0));
        people.add(new Student("Gery", "Snail", 3.5));
        people.add(new Employee("Soobin", "Choi", "Developer", 50000.00));

        Collections.sort(people); 

        printData(people); 
    }

    public static void printData(Iterable<Person> payables) { 
        for (Person p : payables) { 
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}
