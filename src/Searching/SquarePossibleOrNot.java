package Searching;

public class SquarePossibleOrNot {
    public static boolean fn(int x){
        int l=0;
        int r=x;
        while(l<r){
            int mid=l+(r-l)/2;
            if(mid*mid==x){
                return true;
            } else if (mid*mid<x) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println(fn(x));
    }
}
