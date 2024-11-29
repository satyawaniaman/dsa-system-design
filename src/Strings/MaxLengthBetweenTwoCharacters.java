package Strings;

public class MaxLengthBetweenTwoCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] indices=new int[26];
        int ans=-1;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(indices[idx]>0){
                ans=Math.max(ans,i-indices[idx]);
            }else{
                indices[idx]=i+1;
            }
        }
        return ans;
    }
}
