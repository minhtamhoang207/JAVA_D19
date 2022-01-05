package bai2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            File data = new File("src/bai2/input.txt");
            Scanner sc = new Scanner(data);
            int test = sc.nextInt();
            int currentTest = 1;
            FileWriter myWriter = new FileWriter("src/bai2/output.txt", true);
            for(int t=0; t<test; t++){
                int n = sc.nextInt();
                System.out.print("Test " +  currentTest + ": ");
                myWriter.write("Test " +  currentTest + ": ");
                for(int i=2; i<=n; i++){
                    int count = 0;
                    while(n%i==0){
                        n/=i;
                        count++;
                    }
                    if(count>0){
                        System.out.print(i+ "(" + count + ")" + " ");
                        myWriter.write(i+ "(" + count + ")" + " ");
                    }
                }
                System.out.println();
                myWriter.write("\n");
                currentTest++;
            }
            myWriter.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}