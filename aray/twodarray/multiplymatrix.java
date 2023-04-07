package src.aray.twodarray;

import java.util.Scanner;


public class multiplymatrix {
    public static void printmatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {//j array h arr[i]ka
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

            public static void multimatrix ( int a[][], int row, int col, int b[][], int row1, int col1){
                if (col != row1) {
                    System.out.println("error404");
                    return;
                }
                int multi[][] = new int[row][col1];//answer array me phli matrix ka pehla row *dusri matrix ka phla colum multiply hoga
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col1; j++) {
                        for (int k = 0; k < col; k++) {
                            multi[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }
                printmatrix(multi);
            }
            public static void main (String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter rows and column");
                int row = sc.nextInt();
                int col = sc.nextInt();
                int a[][] = new int[row][col];
                System.out.println("enter matrix");
                for (int i = 0; i < row; i++)
                    for (int j = 0; j < col; j++)
                        a[i][j] = sc.nextInt();
                System.out.println("Enter rows and column");
                int row1 = sc.nextInt();
                int col1 = sc.nextInt();
                int b[][] = new int[row1][col1];
                System.out.println("enter matrix");
                for (int i = 0; i < row1; i++)
                    for (int j = 0; j < col1; j++)
                        b[i][j] = sc.nextInt();
                System.out.println("multiplication of matrix");
multimatrix(a,row,col,b,row1,col1);

            }
        }
