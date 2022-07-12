package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


// also can use annotation @Disabled("ticket-1345") if you need disable to all this class with tests
public class SimpleTest {

    // annotation for used name of tests. Also can use for class
    @DisplayName("nameOfTest")
    //annotation for disable test with reason and task number
    @Disabled("ticket-1345")
    @Test
    void simpleTest() {

//        //класс для проверки Assertions
//        Assertions.assertTrue(3>2);

    }

    @Test
    void simpleTest2() {
        throw new RuntimeException("Просто другой эксепшн");
    }
}