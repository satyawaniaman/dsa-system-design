package Patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        int n=5;

        for (int i = 1;i<=2*n-1 ;i++) {
            System.out.print("*");
        }
        System.out.println();
        int space=1;
        int star=n-1;
        for (int j = 1; j <=n-1; j++) {
            for (int k = 1; k <=star; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <=space; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <=star; m++) {
                System.out.print("*");
            }
            System.out.println();
            star--;
            space+=2;
        }
    }
}
