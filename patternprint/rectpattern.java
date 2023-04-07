package patternprint;

import java.util.Scanner;

public class rectpattern {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter row");
        int row= s.nextInt();
        System.out.println("coloum");
        int col= s.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++)
               //below code=>agar hum 1row,last row 1col,last col mai hai to star print hoga ni to space print hoga
                if(i==1 || i==row || j==1 || j==col)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }}}



