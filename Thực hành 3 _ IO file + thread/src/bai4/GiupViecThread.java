package bai4;

public class GiupViecThread extends Thread{
    public void run(){
        int count = 1;
        while (count<=4){
            System.out.println("Giúp việc lau tầng " + count);
            try{
                sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            count++;
        }
        System.out.println("Giúp việc đã lau xong nhà");
    }
}
