package Stacks_Queues;

import java.util.Stack;
//
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={4,5,2,25};
        int[] result=nge(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }

    private static int[] nge(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] output=new int[n];
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                output[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            output[st.peek()]=-1;
            st.pop();
        }
        return output;
    }

}
