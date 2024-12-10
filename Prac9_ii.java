// Practical No. -- 9 (ii)
// Illustrating thread synchronization by ensuring multiple threads 

class Counter { 
    private int count = 0; 

    // Synchronized method to increment the count 
    public synchronized void increment() { 
        count++; 
    } 

    public int getCount() { 
        return count; 
    } 
} 

class CounterThread extends Thread { 
    private Counter counter; 

    public CounterThread(Counter counter) { 
        this.counter = counter; 
    } 

    @Override 
    public void run() { 
        counter.increment(); 
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + counter.getCount()); 
    } 
} 

public class Prac9_ii { 
    public static void main(String[] args) { 
        Counter counter = new Counter(); 

        // Creating multiple threads that share the same Counter object 
        CounterThread thread1 = new CounterThread(counter); 
        CounterThread thread2 = new CounterThread(counter); 
        CounterThread thread3 = new CounterThread(counter); 

        // Starting the threads 
        thread1.start(); 
        thread2.start(); 
        thread3.start(); 
    } 
}
