package main;

public class FizzBuzz
{
    public String fizz_buzz(int number_to_split)
    {
        if (number_to_split%3 == 0 || number_to_split%5 == 0)
        {
            return "";
        }
        return "fail";
    }
}
