package Stacks_Queues;

import java.util.Stack;


//infix to postfix conversion
// postfix evaluation
public class InfixEvaluation {
    public static void main(String[] args) {
        System.out.print(infixEvaluation("100*(2+12)"));
    }
    public static int infixEvaluation(String str){
        String postfix=infixToPostfix(str);
       int result= postfixEvaluation(postfix);
       return result;
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
                if(!stk.isEmpty()&& stk.peek()!=')' ){
                    stk.pop();
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
