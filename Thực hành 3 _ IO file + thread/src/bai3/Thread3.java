package bai3;

public class Thread3 extends Thread{
    private final Data data;

    public Thread3(Data data) {
        this.data = data;
    }
    public void run(){
        while(true){
            synchronized(data){
                data.notifyAll();
                while (data.getIndex() != 3 && data.isRunning()){
                    try{
                        data.wait();
                    } catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
                if(!data.isRunning()){
                    break;
                }
                System.out.print("");
                data.setIndex(1);
            }
        }
    }
}
