package Patterns;

public class Pattern_6 {
    public static void main(String[] args) {
        int n=7;
        int star=1;
        int space=n-2;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=star; j++) {
                System.out.print("*");
            }
            for (int k = 1; k<=space; k++) {
                System.out.print(" ");
            }
            int secStar=star;
            if(i==(n/2)+1){
                secStar--;
            }
            for (int l = 1; l <=secStar ; l++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2) {
                star++;
                space-=2;
            }else{
                star--;
                space+=2;
            }
        }
    }
}
