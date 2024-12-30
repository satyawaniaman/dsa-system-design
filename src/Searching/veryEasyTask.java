package Searching;

import java.util.Scanner;

public class veryEasyTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print(minTime(n,x,y));
    }

    private static int minTime(int n, int x, int y) {
        if(n==1){
            return Math.min(x,y);
        }
        int left=0;
        int right=Math.max(x,y)*n;
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(isValid(n,x,y,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans + Math.min(x,y);
    }
    // the isValid checks if the mid time is enough to make the copies or not.
    private static boolean isValid(int n, int x, int y, int mid) {
        return (mid/x) +(mid/y)>=n-1;
    }
}
