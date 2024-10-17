package twoPointer;

public class sortZeroOrOnes {
    public static void sortZeroOrOnes(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]==0){
                left++;
            }else if (arr[right] == 1) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr={2,42,1,0,3,2,12,0,1,1,0,1,0};
        sortZeroOrOnes(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
