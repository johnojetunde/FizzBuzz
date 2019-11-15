import exception.FizzBuzzException;

class FizzBuzz {
    String computeValue(int number) throws FizzBuzzException {
        if (number <= 0) {
            throw new FizzBuzzException("Invalid fizzbuzz number");
        }

        String value = "";

        if (number % 3 == 0) {
            value += "Fizz";
        }

        if (number % 5 == 0) {
            value += "Buzz";
        }

        return (value.isEmpty()) ? String.valueOf(number) : value;
    }
}
