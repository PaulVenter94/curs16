package ro.fasttrackit.curs16Homework;

import java.util.Objects;

public class Person {
    private int ID;
    private final String name;
    private final int age;

    public Person(String name, int age) {
        if (name == null || age < 0 || age > 120 || name.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getID() == person.getID() &&
                getAge() == person.getAge() &&
                getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
