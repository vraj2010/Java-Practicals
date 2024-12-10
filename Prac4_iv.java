// Practical No. -- 4 (iv)
// Write a java program for the use of final keyword.

final class FinalClass {
    final int value;

    public FinalClass(int value) {
        this.value = value;
    }

    public final void display() {
        System.out.println("The value stored in FinalClass is: " + value);
    }
}

public class Prac4_iv {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass(200);
        obj.display();
    }
}
