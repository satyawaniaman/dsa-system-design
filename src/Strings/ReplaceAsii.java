package Strings;

public class ReplaceAsii {
    public String replaceAsii(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch= sb.charAt(i);
            if(i%2==0){
                ch=(char)(i+1);
                sb.setCharAt(i,ch);
            }else{
                ch=(char)(i-1);
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString();
    }
}
