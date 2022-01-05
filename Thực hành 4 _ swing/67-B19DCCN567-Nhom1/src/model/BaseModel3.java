
package model;
import java.io.Serializable;


public class BaseModel3 implements Serializable{
    
    BaseModel1 customer;
    BaseModel2 bank;
    private double money;
    private int month;
    private String date;

    public BaseModel3(BaseModel1 customer, BaseModel2 bank, double money, int month, String date) {
        this.customer = customer;
        this.bank = bank;
        this.money = money;
        this.month = month;
        this.date = date;
    }

    public BaseModel1 getCustomer() {
        return customer;
    }

    public void setCustomer(BaseModel1 customer) {
        this.customer = customer;
    }

    public BaseModel2 getBank() {
        return bank;
    }

    public void setBank(BaseModel2 bank) {
        this.bank = bank;
    }

    

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
     public Object[] toObjects(){
        return new Object[]{
            getCustomer().getId(), getCustomer().getName(),
            getBank().getId(), getBank().getName(),
            getMonth(), getMoney(), getDate()
        };
    }
}
