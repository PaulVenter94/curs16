package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HelloMavenTest {
    @Test
    @DisplayName("Whatever")
    public void sayHelloTest() {
        //setup
        HelloMaven helloMaven = new HelloMaven();
        //run
        String result = helloMaven.sayHello();
        //assert
        assertNotNull(result);
        assertThat(result)
                .isEqualTo("Hello Maven!");
    }
}
