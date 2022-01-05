package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static <T> List<T> doc(String file){
        List<T> list = new ArrayList<>();
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
            list = (List<T>) input.readObject();
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static <T> void viet(String file, List<T> arr){
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(arr);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
