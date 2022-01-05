
package bai3;

import java.util.Vector;

public class Data {
    private Vector<String> number;
    private int index;
    private boolean running = true;

    public Data() {
        number = new Vector<>();
    }

    public Vector<String> getNumber() {
        return number;
    }

    public void setNumber(Vector<String> number) {
        this.number = number;
    }

    public void addValue(String num){
        number.add(num);
    }
    public String getValue(){
        return number.remove(0);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
    
}
