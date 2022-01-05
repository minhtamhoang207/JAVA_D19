package bai3;

public class Thread2 extends Thread{
    private final Data data;

    public Thread2(Data data) {
        this.data = data;
    }
    public void run(){
        while(true){
            synchronized(data){
                data.notifyAll();
                while (data.getIndex() != 2 && data.isRunning()){
                    try{
                        data.wait();
                    } catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
                if(!data.isRunning()){
                    break;
                }
                double n1 = Double.parseDouble(data.getValue());
                double n2 = Double.parseDouble(data.getValue());
                double result;
                String temp = data.getValue();
                if(temp.equalsIgnoreCase("+")){
                    result = n1 + n2;
                } else if(temp.equalsIgnoreCase("x")){
                    result = n1 * n2;
                } else if(temp.equalsIgnoreCase("-")){
                    result = n1 - n2;
                } else{
                    result = n1/n2;
                }
                if(n2==0){
                    System.out.println("Kết quả phép tính: không thể chia cho 0");
                } else{
                    System.out.println("Kết quả phép tính: " + result);
                }
                data.setIndex(3);
            }
        }
    }
}
