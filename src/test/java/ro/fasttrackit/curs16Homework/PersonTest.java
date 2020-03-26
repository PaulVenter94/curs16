package ro.fasttrackit.curs16Homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    @DisplayName("When trying to create a null name person THEN throw exception")
    void creatingNullNamnePerson(){
        //setup
        //run+assertion
        assertThrows(IllegalArgumentException.class, () -> new Person(null,25));
    }
    @Test
    @DisplayName("When trying to create a invalid age person THEN throw exception")
    void creatingInvalidagePerson(){
        //setup
        //run+assertion
        assertThrows(IllegalArgumentException.class, () -> new Person("George",121));
    }
}