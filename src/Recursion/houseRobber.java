package Recursion;

public class houseRobber {
    public static int rob(int[] arr,int index){
        if(index==arr.length){
            return 0;
        }
        int rob=arr[index]+rob(arr,index+2);
        int dontrob=rob(arr,index+1);
        return Math.max(rob,dontrob);
    }
}
