package Recursion;

public class power {
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }

    public static void main(String[] args) {
        System.out.print(pow(2,3));
    }
}
