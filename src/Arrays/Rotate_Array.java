package Arrays;

public class Rotate_Array {
    public static void rotate(int[] arr,int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        for(int i=1;i<=k;i++){
            int temp=arr[arr.length-1];
            for (int j=1;j<arr.length;j++){
                arr[arr.length-j]=arr[arr.length-j-1];
            }
            arr[0]=temp;
        }
    }
    public static void display(int[] arr){
        for (int a:arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        display(arr);
        rotate(arr,2);
        display(arr);
    }
}
