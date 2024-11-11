package One;

public class MultithreadingExample {

	
		    public static void main(String[] args) throws InterruptedException {
		        // Example of sleep
		        System.out.println("Sleep Example:");
		        Thread.sleep(2000); // Sleep for 2 seconds
		        System.out.println("Awake after sleep!");

		        // Example of join
		        System.out.println("\nJoin Example:");
		        Thread t1 = new Thread(() -> {
		            for (int i = 0; i < 5; i++) {
		                System.out.println("Thread 1 executing...");
		                try {
		                    Thread.sleep(1000);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }
		        });
		        t1.start();
		        t1.join(); // Wait for t1 to finish before proceeding
		        System.out.println("Thread 1 finished execution.");

		        // Example of wait, notify, and notifyAll
		        System.out.println("\nWait, Notify, and NotifyAll Example:");
		        Object lock = new Object();
		        Thread t2 = new Thread(() -> {
		            synchronized (lock) {
		                try {
		                    System.out.println("Thread 2 waiting...");
		                    lock.wait(); // Thread 2 waits for notification
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		                System.out.println("Thread 2 woke up!");
		            }
		        });
		        t2.start();
		        Thread.sleep(2000); // Delay to ensure thread 2 starts waiting
		        synchronized (lock) {
		            lock.notify(); // Notify thread 2 to wake up
		        }
		        Thread.sleep(1000); // Delay to ensure thread 2 wakes up before thread 3 starts
		        Thread t3 = new Thread(() -> {
		            synchronized (lock) {
		                System.out.println("Thread 3 notifying all...");
		                lock.notifyAll(); // Notify all threads waiting on lock
		            }
		        });
		        t3.start();

		        // Example of yield
		        System.out.println("\nYield Example:");
		        Thread t4 = new Thread(() -> {
		            for (int i = 0; i < 5; i++) {
		                System.out.println("Thread 4 executing...");
		                Thread.yield(); // Give up the CPU to allow other threads to run
		            }
		        });
		        Thread t5 = new Thread(() -> {
		            for (int i = 0; i < 5; i++) {
		                System.out.println("Thread 5 executing...");
		                Thread.yield(); // Give up the CPU to allow other threads to run
		            }
		        });
		        t4.start();
		        t5.start();

		        // Example of daemon thread
		        System.out.println("\nDaemon Thread Example:");
		        Thread daemonThread = new Thread(() -> {
		            while (true) {
		                System.out.println("Daemon thread running...");
		                try {
		                    Thread.sleep(1000);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }
		        });
		        daemonThread.setDaemon(true); // Set as daemon thread
		        daemonThread.start();
		        Thread.sleep(3000); // Let the main thread sleep for some time
		        System.out.println("Main thread exiting...");
		    }
		

	}


