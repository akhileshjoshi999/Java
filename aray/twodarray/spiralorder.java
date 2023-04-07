package src.aray.twodarray;

import java.util.Scanner;

public class spiralorder {
    public static void printmatrix(int [][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }
    }
public static void spiral(int matrix[][],int r ,int c){
    int toprow=0; int bottomrow=r-1; int leftcol=0; int rightcol=c-1;
    int totalelement=0;
    while (totalelement < r * c) {
        for (int i = leftcol; i <= rightcol; i++) {
            System.out.print(matrix[toprow][i]+" ");
            totalelement++;
        }
        toprow++;
        for (int j = toprow; j <= bottomrow; j++) {
            System.out.print(matrix[j][rightcol]+" ");
            totalelement++;
        }
        rightcol--;
        for (int i = rightcol; i >= leftcol; i--) {
            System.out.print(matrix[bottomrow][i]+" ");
            totalelement++;
        }
        bottomrow--;
        for (int j = bottomrow; j >= toprow; j--) {
            System.out.print(matrix[j][leftcol]+" " );
            totalelement++;
        }
        leftcol++;
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int r= sc.nextInt();
        System.out.println("Enter column");
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter matrix");
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++) {
                matrix[i][j]=sc.nextInt();
            }
        spiral(matrix,r,c);
        // printmatrix(matrix);
}
}
