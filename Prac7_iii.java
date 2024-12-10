// Practical No. -- 7 (iii)
// Nested of try in Exception Handling

public class Prac7_iii 
{
    public static void main(String[] args) 
    {
        // Outer try block
        try 
        {
            // Array with three elements
            int[] numbers = {1, 2, 3};
            System.out.println("\nOuter try block: Accessing the array element...");
            
            // Inner try block
            try 
            {
                // Trying to divide by zero
                System.out.println("Inner try block: Trying to divide...");
                int result = numbers[2] / 0;  // This will throw an ArithmeticException
                System.out.println("Result of division: " + result);
            }

            catch (ArithmeticException e) 
            {
                System.out.println("Inner catch block: ArithmeticException caught - " + e.getMessage());
            }
            
            // Accessing an element out of array bounds
            System.out.println("Accessing out of bounds element: " + numbers[5]);
        }
        
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Outer catch block: ArrayIndexOutOfBoundsException caught - " + e.getMessage());
        }

        System.out.println("Program ended normally.");
    }
}
