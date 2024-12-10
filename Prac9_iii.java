// Practical No. -- 9 (iii)
// Demonstrating inter-thread communication

class Data { 
    private int value; 
    private boolean isProduced = false; 

    // Producer method to generate data 
    public synchronized void produce(int value) throws InterruptedException { 
        while (isProduced) {
            wait(); // Wait if data is already produced 
        } 
        this.value = value; 
        isProduced = true; 
        System.out.println("Produced: " + value); 
        notify(); // Notify the consumer that data is available 
    } 

    // Consumer method to consume data 
    public synchronized void consume() throws InterruptedException { 
        while (!isProduced) { 
            wait(); // Wait if no data is produced 
        } 
        System.out.println("Consumed: " + value); 
        isProduced = false; 
        notify(); // Notify the producer that data is consumed 
    } 
} 

class Producer extends Thread { 
    private Data data; 

    public Producer(Data data) { 
        this.data = data; 
    } 

    @Override 
    public void run() { 
        try { 
            for (int i = 1; i <= 5; i++) { 
                data.produce(i); 
                Thread.sleep(1000); // Simulate time taken to produce data 
            } 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }
    } 
} 

class Consumer extends Thread { 
    private Data data; 

    public Consumer(Data data) { 
        this.data = data; 
    } 

    @Override 
    public void run() { 
        try { 
            for (int i = 1; i <= 5; i++) { 
                data.consume(); 
                Thread.sleep(1500); // Simulate time taken to consume data 
            } 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    } 
} 

public class Prac9_iii { 
    public static void main(String[] args) { 
        Data data = new Data(); 
        Producer producer = new Producer(data); 
        Consumer consumer = new Consumer(data); 
        producer.start(); 
        consumer.start(); 
    } 
}
