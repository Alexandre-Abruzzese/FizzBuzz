package main;

public class FizzBuzz
{
    public String fizz_buzz(int numberToSplit)
    {
        if (numberToSplit%3 == 0 || numberToSplit%5 == 0)
        {
            if (numberToSplit%3 == 0)
            {
                return "fizz";
            }
            if (numberToSplit%5 == 0)
            {
                return "buzz";
            }
            return "";
        }
        return "fail";
    }
}
