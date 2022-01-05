package model;

import java.io.Serializable;
public class BaseModel2 implements Serializable {
    private int id;
    private String name;
    private int laiXuat;
    private static int sma = 100;

    public BaseModel2(){
        id = sma++;
    }
   
    public BaseModel2(int id, String name, int laiXuat) {    
        this.id = id;
        this.name = name;
        this.laiXuat = laiXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(int laiXuat) {
        this.laiXuat = laiXuat;
    }


    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BaseModel2.sma = sma;
    }

    public Object[] toObjects(){
        return new Object[]{
            getId(), getName(), getLaiXuat()
        };
    }
}
