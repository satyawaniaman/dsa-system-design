package twoPointer;
public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr){
        int idx=1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1]!=arr[i]){
                 arr[idx]=arr[i];
                 idx++;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3};
        System.out.print(removeDuplicates(arr));
    }
}