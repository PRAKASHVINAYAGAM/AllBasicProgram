//package One;
//
//class PrintTable {
//    synchronized void printTable(int n) { // synchronized method
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(4000); // thread sleeps for 400 ms
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
//
//class MyThread1 extends Thread {
//    PrintTable t;
//    MyThread1(PrintTable t) {
//        this.t = t;
//    }
//    public void run() {
//        t.printTable(5);
//    }
//}
//
//class MyThread2 extends Thread {
//    PrintTable t;
//    MyThread2(PrintTable t) {
//        this.t = t;
//    }
//    public void run() {
//        t.printTable(100);
//    }
//}
//
//class Customer {
//    int amount = 10000;
//
//    synchronized void withdraw(int amount) {
//        System.out.println("Going to withdraw...");
//        if (this.amount < amount) {
//            System.out.println("Less balance; waiting for deposit...");
//            try {
//                wait();
//                
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        this.amount -= amount;
//        System.out.println("Withdraw completed! Remaining balance: " + this.amount);
//    }
//
//    synchronized void deposit(int amount) {
//        System.out.println("Going to deposit...");
//        this.amount += amount;
//        System.out.println("Deposit completed! New balance: " + this.amount);
//        notify();
//    }
//}
//
//class WithdrawThread extends Thread {
//    Customer c;
//    WithdrawThread(Customer c) {
//        this.c = c;
//    }
//    public void run() {
//        c.withdraw(15000);
//    }
//}
//
//class DepositThread extends Thread {
//    Customer c;
//    DepositThread(Customer c) {
//        this.c = c;
//    }
//    public void run() {
//        c.deposit(10000);
//    }
//}
//
//public class MultithreadingExample1 {
//    public static void main(String args[]) {
//        // Demonstrate synchronized method
//        PrintTable obj = new PrintTable();
//        MyThread1 t1 = new MyThread1(obj);
//        MyThread2 t2 = new MyThread2(obj);
//        t1.start();
//        t2.start();
//
//        // Demonstrate inter-thread communication
//        Customer c = new Customer();
//        WithdrawThread t3 = new WithdrawThread(c);
//        DepositThread t4 = new DepositThread(c);
//        t3.start();
//        //t3.join(2000);
//        t4.start();
//    }
//}
//
