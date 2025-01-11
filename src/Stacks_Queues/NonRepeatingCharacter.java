package Stacks_Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
//Find the first non-repeating character from a stream of characters using Queue
public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String A = "abbbbbb";
        System.out.println(firstNonRepeating(A));
    }

    private static String firstNonRepeating(String a) {
        Queue<Character> q=new LinkedList<>();
        Map<Character,Integer> map=new HashMap<>();
        String ans="";
        for(int i=0;i<a.length();i++){
            if(!map.containsKey(a.charAt(i))){
                q.add(a.charAt(i));
            }
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
            while(!q.isEmpty()&& (map.get(q.peek())>1)){
                q.remove();
            }
            if(!q.isEmpty()){
                ans+=q.peek();
            }else{
                ans+="-1";
            }
        }
        return ans;
    }
}
