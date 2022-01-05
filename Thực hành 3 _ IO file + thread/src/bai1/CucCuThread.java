package bai1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CucCuThread extends Thread {
    public void run(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        while (true){
            Date now = new Date();
            System.out.println();
            System.out.println(dateFormat.format(now));
            String last = dateFormat.format(now).substring(dateFormat.format(now).length()-2);
            System.out.println("Cuc cu");
            if(Integer.parseInt(last)%11 == 0){
                break;
            }
            try{
                sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
