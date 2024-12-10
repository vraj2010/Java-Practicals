// Practical No. -- 9 (v)
// Deadlock conditions using proper synchronization techniques.

class Buffer { 
    private int value; 
    private boolean isProduced = false; // Flag to check if value is produced or not 
    
    // Producer method to produce data 
    public synchronized void produce(int value) throws InterruptedException { 
        while (isProduced) { 
            wait(); // Wait if data has already been produced 
        } 
        this.value = value; 
        System.out.println("Produced: " + value); 
        isProduced = true; 
        notify(); // Notify consumer that data is available 
    } 
    
    // Consumer method to consume data 
    public synchronized void consume() throws InterruptedException { 
        while (!isProduced) { 
            wait(); // Wait if no data is produced 
        } 
        System.out.println("Consumed: " + value); 
        isProduced = false; 
        notify(); // Notify producer that data has been consumed 
    }
}

class Producer extends Thread { 
    private Buffer buffer; 
    
    public Producer(Buffer buffer) { 
        this.buffer = buffer; 
    } 
    
    @Override 
    public void run() { 
        try { 
            for (int i = 1; i <= 5; i++) { 
                buffer.produce(i); 
                Thread.sleep(1000); // Simulate time taken to produce data 
            } 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    }
}

class Consumer extends Thread { 
    private Buffer buffer; 
    
    public Consumer(Buffer buffer) { 
        this.buffer = buffer; 
    } 
    
    @Override 
    public void run() { 
        try { 
            for (int i = 1; i <= 5; i++) { 
                buffer.consume(); 
                Thread.sleep(1500); // Simulate time taken to consume data 
            } 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    }
}

public class Prac9_v { 
    public static void main(String[] args) {  
        Buffer buffer = new Buffer(); // Shared buffer 
        Producer producer = new Producer(buffer); 
        Consumer consumer = new Consumer(buffer); 
        producer.start(); 
        consumer.start(); 
    } 
}
