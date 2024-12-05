package Recursion;
//Given a number x, calculate the count
//of number  of binary stings of length x, which has no consecutive ones.
// eg x=3 ans =5
//101
//001
//000
//010
//100 this quesiot follow fibonacci pattern

public class countBinary {
    public static int count(int x){
        if(x==1){
            return 2;
        }
        if(x==2){
            return 3;
        }
        return count(x-1) + count(x-2);
    }

    public static void main(String[] args) {
        System.out.println(count(5));
    }
}
