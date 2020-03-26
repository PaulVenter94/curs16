package ro.fasttrackit.curs16Homework;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> personList;

    public PersonService() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return new ArrayList<>(personList);
    }

    public Person addPerson(Person person) {
        personList.add(person);
        personList.get(personList.size()-1).setID(personList.size());
        return person;
    }


    public void removePerson(int index) {
        Person person = findPerson(index);
        if (person == null) {
            throw new PersonDoesNotExistException();
        } else {
            personList.remove(findPerson(index));
        }
    }

    private Person findPerson(int index) {
        for (Person person : personList) {
            if (person.getID() == index) {
                return person;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "personList=" + personList +
                '}';
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> result = new ArrayList<>();
        if (age >= 0 && age <= 120) {
            for (Person person : personList) {
                if (age < person.getAge()) {
                    result.add(person);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        return result;
    }

    public List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            names.add(person.getName());
        }
        return names;
    }

    public Person getPersonByName(String name) {
        if (name != null) {
            Person person = findPerson(name);
            if (person != null) {
                return person;
            } else {
                throw new PersonDoesNotExistException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private Person findPerson(String name) {
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonById(int id) {
        if (id > 0) {
            Person person = getPersonById(id);
            if (person != null) {
                return person;
            } else {
                throw new PersonDoesNotExistException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
