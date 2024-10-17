package ArrayList;

import java.util.ArrayList;

public class IntersectionOfArrays {
    static ArrayList<Integer> intersection(int[]arr1,int[] arr2){
        ArrayList<Integer> newArr=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]) {
                i++;
            }else if (arr1[i]>arr2[j]) {
                j++;
            }else{
                newArr.add(arr1[i]);
                i++;
                j++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr1={10,19,20,30,40,50};
        int[] arr2={15,16,20,25,30,40};
        System.out.print(intersection(arr1,arr2));
    }

}
