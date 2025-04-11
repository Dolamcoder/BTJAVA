package TrietGiaThieuDua;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

class Philosopher extends Thread {
    private final int id;
    private final Semaphore leftFork;
    private final Semaphore rightFork;
    private final Semaphore diningLimit;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork, Semaphore diningLimit) {
        this.id = id;
        this.leftFork = leftFork;  
        this.rightFork = rightFork;
        this.diningLimit = diningLimit;
    }

    private void think() {
        System.out.println("Philosopher " + id + " is thinking.");
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat() {
        System.out.println("Philosopher " + id + " is eating.");
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            think();
            try {
                diningLimit.acquire(); // Chỉ cho phép tối đa 4 triết gia ăn cùng lúc
                
                leftFork.acquire();
                System.out.println("Philosopher " + id + " picked up LEFT fork.");
                
                rightFork.acquire();
                System.out.println("Philosopher " + id + " picked up RIGHT fork.");
                
                eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Philosopher " + id + " put down RIGHT fork.");
                rightFork.release();
                
                System.out.println("Philosopher " + id + " put down LEFT fork.");
                leftFork.release();
                
                diningLimit.release(); // Nhường chỗ cho triết gia khác
            }
        }
    }
}

