package src.aray.twodarray;

import java.util.Scanner;

public class spiralarrayinsert {
    public static void printmatrix(int [][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }
    }
    public static int [][] spiral(int n){
       int matrix[][]=new int[n][n];
        int toprow=0; int bottomrow=n-1; int leftcol=0; int rightcol=n-1;
        int current=1;
        while (current <= n*n) {
            for (int i = leftcol; i <= rightcol; i++) {
                matrix[toprow][i] = current;
                current++;
            }
            toprow++;
            for (int j = toprow; j <= bottomrow; j++) {
                matrix[j][rightcol] = current;
                current++;
            }
            rightcol--;
            for (int i = rightcol; i >= leftcol; i--) {
                matrix[bottomrow][i] = current;
                current++;
            }
            bottomrow--;
            for (int j = bottomrow; j >= toprow; j--) {
                matrix[j][leftcol] = current;
                current++;
            }
            leftcol++;
        }
        return matrix;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
int matrix[][]=spiral(n);
printmatrix(matrix);
    }
}
