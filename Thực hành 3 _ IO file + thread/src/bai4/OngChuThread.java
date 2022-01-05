package bai4;

public class OngChuThread extends Thread {
    public void run(){
        int count = 1;
        while (count<=4){
            System.out.println("Ông chủ kiểm tra tầng " + count);
            try{
                sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            count++;
        }
        System.out.println("Ông chủ kiểm tra xong");
    }
}
