package Recursion;

public class removeOccuranceOfX {
    public static void removeX(String s,int index){
        if(index==s.length()){
            return;
        }
        if(s.charAt(index)!='x'){
            System.out.print(s.charAt(index));
        }
        removeX(s,index+1);
    }

    public static void main(String[] args) {
        String s="abcxxad";
        removeX(s,0);
    }
}
