// Practical No. -- 9 (i)
// Thread class and the Runnable interface 

class MyThread extends Thread { 
    @Override 
    public void run() { 
        System.out.println("Task 1 from MyThread"); 
    } 
} 

class MyRunnable implements Runnable { 
    @Override 
    public void run() { 
        System.out.println("Task 2 from MyRunnable"); 
    } 
} 

public class Prac9_i { 
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(); 
        thread1.start(); 

        Thread thread2 = new Thread(new MyRunnable()); 
        thread2.start(); 
    } 
}
