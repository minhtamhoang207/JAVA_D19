package model;

import java.io.Serializable;
public class BaseModel1 implements Serializable {
    private int id;
    private String name;
    private String address;
    private String type;
    private static int sma = 10000;

    public BaseModel1(int id, String name, String address, String type) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.type = type;
    }

    
    public BaseModel1(){
        id = sma++;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {    
        this.type = type;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BaseModel1.sma = sma;
    }

    public Object[] toObjects(){
        return new Object[]{
            getId(), getName(), getAddress(), getType()
        };
    }
}

//DateFormat dateFormat;
//        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        List<Date> list_time = new ArrayList<>();
//        for(int i=0; i<5; i++){
//            list_time.add(new Date());
//            TimeUnit.SECONDS.sleep(1);
//        }
//        Collections.sort(list_time);
//        for(int i=0; i<5; i++){
//            System.out.println(dateFormat.format(list_time.get(i)));
//        }
//
//Collections.sort(myList, new Comparator<MyObject>() {
//  public int compare(MyObject o1, MyObject o2) {
//      return o1.getDateTime().compareTo(o2.getDateTime());
//  }
//});


//Set<String> setA = new HashSet<String>();
//        setA.add("Java");
//        setA.add("Python");
//        setA.add("Java");
//        setA.add("PHP");
//        for (String element : setA) {
//            System.out.println(element);
//        }
//List<String> listA = new ArrayList<String>();
//        listA.addAll(setA);
//        System.out.println(listA);