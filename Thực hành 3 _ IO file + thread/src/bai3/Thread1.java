package bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Thread1 extends Thread{
    private final Data data;

    public Thread1(Data data) {
        this.data = data;
    }
    public void run(){
        File path = new File("src/bai3/cauhoi.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            synchronized(data){
                if (sc != null) {
                    while (sc.hasNextLine()){
                        String[] dt = sc.nextLine().split("\\s+");
                        for(String i : dt){
                            data.addValue(i);
                        }
                        data.setIndex(2);
                        data.notifyAll();
                        data.wait();
                        sleep(1000);
                    }
                }
                data.setRunning(false);
                data.notifyAll();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
