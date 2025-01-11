package Stacks_Queues;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        System.out.print(postfixEvaluation("2536+**5/2-"));
    }
    public static Integer postfixEvaluation(String str){
        Stack<Integer> stk=new Stack<>();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                stk.push(c-'0');
            }else{
                int op2=stk.pop();
                int op1=stk.pop();
                switch (c) {
                    case '+' -> stk.push(op1 + op2);
                    case '-' -> stk.push(op1 - op2);
                    case '/' -> stk.push(op1 / op2);
                    case '*' -> stk.push(op1 * op2);
                };
            }
        }
        return stk.pop();
    }
}
