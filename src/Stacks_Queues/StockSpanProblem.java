package Stacks_Queues;

import java.util.Stack;

public class StockSpanProblem {
    public static int[] findStockSpans(int[] prices) {
        // Write your code here.
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        int[] output=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[i]>prices[st.peek()]){
                st.pop();
            }
            output[i]=st.isEmpty()?i+1:i-st.peek();

            st.push(i);
        }
        return output;


    }

    public static void main(String[] args) {
        int[] arr={2,1,2,4};
        int[] result=findStockSpans(arr);
        for (int nums:result) {
            System.out.print(nums+" ");
        }
    }
}
