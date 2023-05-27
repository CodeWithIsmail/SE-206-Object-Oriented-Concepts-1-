import java.util.ArrayList;

public class University {
    ArrayList<Person> persons = new ArrayList<>();

    public University(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public String getFullNames() {
        String fullName = "";
        for (Person person : persons) {
            fullName += person.getFullName() + ", ";
        }
        fullName = fullName.substring(0, fullName.length() - 2);
        return fullName;
    }

    public Person getOldestPerson() {
        Person oldest = null;
        int max = 0;
        for (Person person : persons) {
            if (person.getAge() > max) {
                max = person.getAge();
                oldest = person;
            }
        }
        return oldest;
    }

    public Person getYoungestPerson() {
        Person youngest = null;
        int min = 100;
        for (Person person : persons) {
            if (person.getAge() < min) {
                min = person.getAge();
                youngest = person;
            }
        }
        return youngest;
    }

    public ArrayList<Person> getVoters() {
        ArrayList<Person> voters = new ArrayList<>();
        for (Person person : persons) {
            if (person.canVote()) {
                voters.add(person);
            }
        }
        return voters;
    }

    public int getNumberOfEmployees() {
        int employee = 0;
        for (Person person : persons) {
            if (person.getFullName().contains("Employee"))
                employee++;
        }
        return employee;
    }
}
