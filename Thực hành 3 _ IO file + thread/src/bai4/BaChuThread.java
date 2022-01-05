package bai4;

public class BaChuThread extends Thread {
    public void run(){
        int count = 1;
        while (count<=4){
            System.out.println("Bà chủ lên tầng " + count);
            try{
                sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            count++;
        }
    }
}
