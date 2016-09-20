
public class AddNum
{
    // instance variable for Num with a type Double
    private double num;

    /**
     * Description: It reads out the two numbers adds.
     * Input: The type double
     * Output: The type double
     * Example: 1.5+1 = 2.5
     */
    public AddNum(double num1, double num2)
    {
        // adding two numbers
        num = num1 +num2;
    }

    public void showAnswer()
    {
        System.out.println("Sum of two numbers="+ num); // reads the sum of two numbers
    }

}
