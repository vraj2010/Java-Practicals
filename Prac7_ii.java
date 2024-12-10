// Practical No. -- 7 (ii)
// Multiple catch block in Exception Handling

public class Prac7_ii 
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] numbers = {10, 20, 30};
            int result = numbers[1] / 0;  // This will cause ArithmeticException

            System.out.println(numbers[3]);  // This will cause ArrayIndexOutOfBoundsException
        }
        
        catch (ArithmeticException e) 
        {
            System.out.println("\nCannot divide by zero! " + e);
        }
        
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("\nArray index is out of bounds! " + e);
        }
        
        catch (Exception e) 
        {
            System.out.println("\nAn unexpected error occurred: " + e);
        }
    }
}

