package ro.fasttrackit.curs16Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonServiceTest {
    private PersonService personList;

    @BeforeEach
    void setup() {
        personList = new PersonService();
    }

    @Test
    @DisplayName("WHEN adding a person THEN an index should be set")
    void testIndexGivenCorrect() {
        //setup
        Person person = new Person("George", 25);
        Person person1 = new Person("Paul", 25);
        //run
        personList.addPerson(person);
        personList.addPerson(person1);
        //assert
        assertThat(person1.getID()).isEqualTo(2);
        assertThat(person.getID()).isEqualTo(1);
    }

    @Test
    @DisplayName("When adding a person THEN that person is returned")
    void returnAddedPerson() {
        //setup
        Person person = new Person("George", 25);
        //run+assert
        assertThat(personList.addPerson(person)).isEqualTo(person);
    }


    @Test
    @DisplayName("WHEN trying to remove an index that doesn't exists THEN throw exception")
    void tryToRemoveIndexTHatDoesntExist() {
        //Setup
        //RUN+ASSERT
        System.out.println(personList.getPersonList());
        assertThrows(PersonDoesNotExistException.class, () -> personList.removePerson(3));
    }

    @Test
    @DisplayName("When removing a valid index THEN it removes that person")
    void removeValidIndex() {
        //setup
        personList.addPerson(new Person("George", 25));
        personList.addPerson(new Person("Paul", 35));
        //run
        personList.removePerson(2);
        //assert
        assertTrue(personList.getPersonList().size() == 1);
    }

    @Test
    @DisplayName("WHEN call getPersonList THEN a list of persons is received IF null then a new list is returned")
    void getPersonList() {
        //setup
        //run
        List<Person> list = personList.getPersonList();
        //assert
        assertTrue(list != null);
    }

    @Test
    @DisplayName("WHEN getPersonOlderThan if age is negative or >120 THEN exceptions is thrown")
    void getOlder() {
        //setup
        //run+assert
        assertThrows(IllegalArgumentException.class, () -> personList.getPersonsOlderThan(-5));
    }

    @Test
    @DisplayName("WHEN called getAllNames THEN then a list of strings is returned")
    void getPersonsByName() {
        //setup
        //run
        personList.addPerson(new Person("George", 34));
        List<String> list = new ArrayList<>(List.of("George"));
        //assert
        assertThat(list).isEqualTo(personList.getAllNames());
    }

    @Test
    @DisplayName("When passed a null name as param THEN give a slap")
    void getPersonNullParam() {
        //setup
        //run+assert
        personList.addPerson(new Person("George", 34));
        assertThrows(IllegalArgumentException.class, () -> personList.getPersonByName(null));
    }

    @Test
    @DisplayName("When given a valid name THEN it returns that person")
    void getPersonByName() {
        //setup
        Person person = new Person("George", 34);
        //run
        personList.addPerson(person);
        //assert
        assertThat(person).isEqualTo(personList.getPersonByName("George"));
    }

    @Test
    @DisplayName("When search by ID and is negative THEN throw exception")
    void getByIDNegativeID() {
        //setup
        personList.addPerson(new Person("George", 34));
        //run+assert
        assertThrows(IllegalArgumentException.class, () -> personList.getPersonById(-2));
    }
}
