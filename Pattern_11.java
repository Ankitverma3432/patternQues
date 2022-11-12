package PW.Loops.PatternQues;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();


        for(int i=1; i<=row; i++){
            // for spaces
            for(int j=1; j<=row-i;j++){
                System.out.print(" ");
            }
            // from 1 to i
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            // from (i-1) to 1
            for(int l=i-1; l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
