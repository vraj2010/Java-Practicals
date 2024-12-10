// Practical No. -- 9 (iv)
// Thread Priority

class MyThread extends Thread { 
    public MyThread(String name) { 
        super(name); 
    } 

    @Override 
    public void run() { 
        // Print thread name and its priority 
        System.out.println(Thread.currentThread().getName() + " with priority " + 
                           Thread.currentThread().getPriority() + " is running."); 
    } 
} 

public class Prac9_iv { 
    public static void main(String[] args) { 
        MyThread thread1 = new MyThread("Thread 1"); 
        MyThread thread2 = new MyThread("Thread 2"); 
        MyThread thread3 = new MyThread("Thread 3"); 
        
        // Set thread priorities 
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1 
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default) 
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10 
        
        // Print the priorities 
        System.out.println(thread1.getName() + " priority: " + thread1.getPriority()); 
        System.out.println(thread2.getName() + " priority: " + thread2.getPriority()); 
        System.out.println(thread3.getName() + " priority: " + thread3.getPriority()); 
        
        // Start the threads 
        thread1.start(); 
        thread2.start(); 
        thread3.start(); 
    } 
}
