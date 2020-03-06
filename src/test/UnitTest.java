package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UnitTest
{
    private static final FizzBuzz fizzbuzz = new FizzBuzz();
    public int numberToSplit = 30;

    @Test
    public void should_return_empty_string_if_number_is_not_divisible()
    {
        assertThat(fizzbuzz.fizz_buzz(numberToSplit), equalTo(""));
    }

    @Test
    public void should_return_fizz_if_number_is_divisible_by_three()
    {
        assertThat(fizzbuzz.fizz_buzz(numberToSplit), equalTo("fizz"));
    }

    @Test
    public void should_return_buzz_if_number_is_divisible_by_five()
    {
        assertThat(fizzbuzz.fizz_buzz(numberToSplit), equalTo("buzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_number_is_divisible_by_three_and_five()
    {
        assertThat(fizzbuzz.fizz_buzz(numberToSplit), equalTo("fizzbuzz"));
    }
}
