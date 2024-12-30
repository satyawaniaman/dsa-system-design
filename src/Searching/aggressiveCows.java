package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        int n=5;
        int c=3;
        int[] arr={1,2,8,4,9};
        System.out.println(distribureCows(arr,n,c));
    }

    private static int distribureCows(int[] arr, int n, int c) {
        Arrays.sort(arr);
        int low=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isValid(arr,mid,n,c)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    private static boolean isValid(int[] arr, int mid, int n, int c) {
        int count=1;
        int last_pos=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last_pos>=mid){
                last_pos=arr[i];
                count++;
            }
            if(count==c){
                return true;
            }
        }
        return false;
    }
}
