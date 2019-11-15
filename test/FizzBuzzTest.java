import exception.FizzBuzzException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_throw_an_exception_when_number_is_0_or_less() {
        assertThrows(FizzBuzzException.class, () -> fizzBuzz.computeValue(0));

        assertThrows(FizzBuzzException.class, () -> fizzBuzz.computeValue(-1));
    }

    @Test
    void should_not_throw_an_exception_when_number_is_greater_than_0() {
        assertDoesNotThrow(() -> fizzBuzz.computeValue(1));

        assertDoesNotThrow(() -> fizzBuzz.computeValue(2));
    }

    @Test
    void should_return_same_number() throws FizzBuzzException {
        assertFizzBuzzValue("1", 1);

        assertFizzBuzzValue("7", 7);
    }

    @Test
    void should_return_fizz_when_number_is_divisible_by_3() throws FizzBuzzException {
        assertFizzBuzzValue("Fizz", 3);

        assertFizzBuzzValue("Fizz", 9);

        assertFizzBuzzValue("Fizz", 21);
    }

    @Test
    void should_return_buzz_when_number_is_divisible_by_5() throws FizzBuzzException {
        assertFizzBuzzValue("Buzz", 5);

        assertFizzBuzzValue("Buzz", 10);

        assertFizzBuzzValue("Buzz", 100);
    }

    @Test
    void should_return_fizzBuzz_when_number_is_divisible_by_3_and_5() throws FizzBuzzException {
        assertFizzBuzzValue("FizzBuzz", 15);

        assertFizzBuzzValue("FizzBuzz", 30);

        assertFizzBuzzValue("FizzBuzz", 45);
    }

    private void assertFizzBuzzValue(String expected, int number) throws FizzBuzzException {
        assertEquals(expected, fizzBuzz.computeValue(number));
    }


}
