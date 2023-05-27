import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Person class example
        Person person1=new Person("ismail","hossain",19);
        Person person2=new Person("mahfuz","ayon",20);
        Person person3=new Person("nandan","bhowmick",21);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());

        System.out.println(person1.getFullName());
        System.out.println(person1.getAge());
        person1.setAge(10);
        System.out.println(person1.getAge());
        System.out.println(person1.canVote());

        System.out.println(person2.getFullName());
        System.out.println(person2.getAge());
        person2.setAge(19);
        System.out.println(person2.getAge());
        System.out.println(person2.canVote());
        System.out.println();

        //Student subclass
        Student student1=new Student("rakib","hasan",19);
        System.out.println(student1.getFullName());

        //Employee subclass
        Employee employee1=new Employee("mahbub","hasan",29);
        System.out.println(employee1.getFullName());

        //University class example

        ArrayList<Person> person=new ArrayList<>();
        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(student1);
        person.add(employee1);
        University university1=new University(person);

        //Get full names
        System.out.println("Full name:");
        System.out.println(university1.getFullNames());
        System.out.println();

        //Youngest person
        System.out.println("Youngest Person:");
        System.out.println(university1.getYoungestPerson());
        System.out.println();

        //Oldest person
        System.out.println("Oldest person:");
        System.out.println(university1.getOldestPerson());
        System.out.println();

        //Get voters
        System.out.println("Voters List:");
        for(Person persons: university1.getVoters())
            System.out.println(persons);
        System.out.println();

        //Get Number of employees
        System.out.println("Number of Employee: "+university1.getNumberOfEmployees());
    }
}