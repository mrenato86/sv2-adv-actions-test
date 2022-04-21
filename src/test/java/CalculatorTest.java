import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(11, new Calculator().add(5, 6));
    }

    @Test
    void subtract() {
        assertEquals(11, new Calculator().subtract(22, 11));
    }

}