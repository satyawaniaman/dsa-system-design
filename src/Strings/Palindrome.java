package Strings;

public class Palindrome {
    public static boolean palindrome(String s){
        int j=s.length()-1;
        for (int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="racecar";
        System.out.print(palindrome(s));
    }
}
