package bai1;

public class DogThread extends Thread {
    private CucCuThread cucCuThread;
    DogThread(CucCuThread cucCuThread){
        this.cucCuThread = cucCuThread;
    }
    public void run(){
        while (cucCuThread.isAlive()){
            System.out.println("Gau gau");
            try{
                sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Wow woww");
    }
}
