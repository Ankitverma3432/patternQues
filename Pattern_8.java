package PW.Loops.PatternQues;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        for(int i=1; i<=row;i++){
            for(int j=1; j<=column; j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
