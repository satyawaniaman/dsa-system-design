package Recursion;

public class firstOccurance {
    public static int first(int[] arr,int index,int x){
        if(index== arr.length){
            return -1;
        }
        return (arr[index]==x) ? index : first(arr,index+1,x);
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,22,41};
        int x=4;
        System.out.print(first(arr,0,x));
    }
}
