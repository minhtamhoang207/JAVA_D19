package bai1;

public class Main {
    public static void main(String[] args) {
        CucCuThread cucCuThread = new CucCuThread();
        DogThread dogThread = new DogThread(cucCuThread);
        dogThread.start();
        cucCuThread.start();
    }
}
