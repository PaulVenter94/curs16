package ro.fasttrackit.curs16;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PalindromeTest {
    private Palindrome palindrome;

    @BeforeAll
    void setup() {
        palindrome = new Palindrome();
    }

    @Test
    @DisplayName("WHEN null is received THEN response is false")
    void nullPalindrome() {
        //Setup
        Palindrome palindrome = new Palindrome();
        //run
        boolean result = palindrome.isPalindorme(null);
        //Assert
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("WHEN empty string is received THEN response is trune")
    void emptyString() {
        //setup
        //run
        var result = palindrome.isPalindorme("");
        //assert
        assertTrue(result);
    }

    @Test
    @DisplayName("When single char is received THEN response is true")
    void singleChar() {
        //setup
        //run
        var result = palindrome.isPalindorme("A");
        //assert
        assertTrue(result);
    }

    @Test
    @DisplayName("When non palindrome is received THEN response is FALSE")
    void notPalindrme() {
        //setup
        //run
        var result = palindrome.isPalindorme("notaPalindrome");
        //assert
        assertFalse(result);
    }

    @Test
    @DisplayName("When palindrome is received THEN response is True")
    void Palindrme() {
        //setup
        //run
        var result = palindrome.isPalindorme("ana");
        //assert
        assertTrue(result);
    }

    @Test
    @DisplayName("When a palindrome with Upper is received THEN response is True")
    void palindormeWithUpperCase() {
        //setup
        //run
        var result = palindrome.isPalindorme("Ana");
        //assert
        assertTrue(result);
    }

    @Test
    @DisplayName("When a palindrome phrase is received THEN response is True")
    void palindormeWithPhraseCase() {
        //setup
        //run
        var result = palindrome.isPalindorme("ele fac cafele");
        //assert
        assertTrue(result);
    }

    @Test
    @DisplayName("When a palindrome phrase is received THEN response is True")
    void palindormeWithInvis() {
        //setup
        //run
        var result = palindrome.isPalindorme("ele\nfac cafele");
        //assert
        assertTrue(result);
    }
}
