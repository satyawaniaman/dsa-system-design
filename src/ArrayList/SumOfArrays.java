package ArrayList;

import java.util.ArrayList;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arr1={9,9,9};
        int[] arr2={9,9};
        System.out.print(sumOfArr(arr1,arr2));
    }
    static ArrayList<Integer> sumOfArr(int[] arr1,int[] arr2){
        ArrayList<Integer> newArr=new ArrayList<>();
        int i=arr1.length-1,j= arr2.length-1;
        int carry=0;
        while(i>=0 ||  j>=0){
            int sum=0;
            if(i>=0){
                sum+=arr1[i];
            }
            if(j>=0){
                sum+=arr2[j];
            }
            sum+=carry;
            int rem=sum%10;
            carry=sum/10;
            newArr.add(0,rem);
            i--;
            j--;
        }
        if(carry!=0){
            newArr.add(0,carry);
        }
        return newArr;
    }
}
