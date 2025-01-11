package Stacks_Queues;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        System.out.print(prefixToPostfix("*+AB-CD"));
    }
    public static boolean isOperator(char c){
        return (c=='+'||c=='-'||c=='*'||c=='/'||c=='^');
    }
    public static String prefixToPostfix(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        Stack<String> stk=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c =sb.charAt(i);
            if(isOperator(c)){
                String op1= stk.pop();
                String op2=stk.pop();
                String result=op1+op2+c;
                stk.push(result);
            }else{
                stk.push(Character.toString(c));
            }

        }
        return stk.pop();
    }
}
