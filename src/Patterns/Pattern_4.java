package Patterns;

public class Pattern_4 {
    public static void main(String[] args) {
        int n=7;
        int space=n/2;
        int star=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=star; k++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }
        }
    }
}
