
public class AddNum
{
    // instance variable for Num with a type Double
    private double num;

    /**
     * Description: It reads out the two numbers addes.
     * Input: The type double
     * Output: The type double
     * Example: 1+1 = 2
     */
    public AddNum(double num1, double num2)
    {
        // adding two numbers
        num = num1 +num2;
    }

    public void getNum()
    {
        System.out.println("Sum of two numers="+ num); // reads the sum of two numbers
    }

}
