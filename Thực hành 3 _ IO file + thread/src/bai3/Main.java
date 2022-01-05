package bai3;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();
        Thread1 thread1 = new Thread1(data);
        Thread2 thread2 = new Thread2(data);
        Thread3 thread3 = new Thread3(data);
        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
