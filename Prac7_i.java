// Practical No. -- 7 (i)
// try-catch block in Exception Handling

public class Prac7_i 
{
    public static void main(String[] args) 
    {
        int numerator = 10;
        int denominator = 0;
        int result;

        try
        {
            // This will throw an ArithmeticException if denominator is 0
            result = numerator / denominator;
            System.out.println("\nResult: " + result);
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("\nException caught: Division by zero is not allowed.");
        }
        
        System.out.println("Program continues after the try-catch block.");
    }
}
