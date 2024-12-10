// Practical No. -- 7 (v)
// finally Block in Exception Handling

public class Prac7_v {
    public static void main(String[] args) {
        try 
        {
            int a = 10;
            int b = 0;
            int result = a / b;  // This will cause an ArithmeticException
            System.out.println("\nResult: " + result);
        }

        catch (ArithmeticException e) 
        {
            System.out.println("\nException caught: " + e);
        }

        finally 
        {
            System.out.println("This is the finally block. It always executes.");
        }

        System.out.println("End of program.");
    }
}
