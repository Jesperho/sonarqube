import static org.example.Main.addMe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testAddMePositiveNumbers() {
        int result = addMe(12, 4);  // Normal case with positive numbers
        assertEquals(16, result);  // Assert that the result is correct
    }

    @Test
    public void testAddMeZero() {
        int result = addMe(0, 4);  // Edge case: adding zero
        assertEquals(4, result);  // The sum should be 4

        result = addMe(12, 0);  // Edge case: adding zero to another number
        assertEquals(12, result);  // The sum should be 12
    }

    @Test
    public void testAddMeNegativeNumbers() {
        int result = addMe(-12, -4);  // Case with negative numbers
        assertEquals(-16, result);  // The sum should be -16
    }

    @Test
    public void testAddMePositiveAndNegative() {
        int result = addMe(12, -4);  // Case with a positive and a negative number
        assertEquals(8, result);  // The sum should be 8
    }

    @Test
    public void testAddMeLargeNumbers() {
        int result = addMe(1000000, 2000000);  // Case with large numbers
        assertEquals(3000000, result);  // The sum should be 3000000
    }
}
