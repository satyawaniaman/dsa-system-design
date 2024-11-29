package Strings;
public class SubStrings {
    public static void subString(String s){
        for (int si=0;si<s.length();si++){
            for (int ei=si+1;ei<=s.length();ei++){//ei<= because we want to go one index beyond end
                System.out.println(s.substring(si,ei));
            }
        }
    }
}
