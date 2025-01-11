package Stacks_Queues;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.print(infixToPostfix("A+B"));
    }
    public static int precedence(char c) {
        return switch (c) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> 0;
        };
    }
    public static boolean isOperand(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
    public static String infixToPostfix(String exp){
        String postfix=new String("");
        Stack<Character> stk=new Stack<>();
        for (int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(isOperand(c)){
                postfix+=c;
            } else if (c=='(') {
                stk.push(c);
            } else if (c==')') {
                while (stk.peek()!='('){
                    postfix+=stk.pop();
                }
            }else{
                while(!stk.isEmpty() && precedence(c)<=precedence(stk.peek())){
                    postfix+=stk.pop();
                }
                stk.push(c);
            }
        }
        while (!stk.isEmpty()){
            postfix+=stk.pop();
        }
        return postfix;
    }
}
