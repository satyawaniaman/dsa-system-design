package Recursion;

public class printArray {
    public static void arrayprint(int[] arr,int index){
        if(index>=arr.length){
            return;
        }
        System.out.print(arr[index] +" ");
        arrayprint(arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr= {1,23,4,22,122,5,88,6};
        arrayprint(arr,0);
    }
}
