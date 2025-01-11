package Stacks_Queues;

import java.util.LinkedList;
import java.util.Queue;
//given a number N wap that generates &prints all binary numbers with decimal values from 1-N
public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n=7;
        generateBinary(n);
    }
    public static void generateBinary(int n){
        Queue<String> queue=new LinkedList<>();
        queue.add("1");
        while(n-->0){
            String n1=queue.remove();
            System.out.print(n1+" ");
            queue.add(n1+"0");
            queue.add(n1+"1");
        }
    }


}
