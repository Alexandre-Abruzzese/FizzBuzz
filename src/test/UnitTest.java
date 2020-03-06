package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UnitTest
{
    private static final FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void should_return_empty_string_if_number_is_not_divisible()
    {
        int numberToSplit = 40;
        assertThat(fizzbuzz.fizz_buzz(numberToSplit), equalTo(""));
    }

    @Test
    public void should_return_fizz_if_number_is_divisible_by_three()
    {
        int numberToSplit = 3;
        assertThat(fizzbuzz.fizz_buzz(numberToSplit), equalTo("fizz"));
    }
}
