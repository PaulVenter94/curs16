package ro.fasttrackit.curs16Homework;

public class PersonDoesNotExistException extends RuntimeException {
    public PersonDoesNotExistException() {
        super("Person not found!");
    }
}
