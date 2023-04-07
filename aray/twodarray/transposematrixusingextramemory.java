package src.aray.twodarray;

import java.util.Scanner;

public class transposematrixusingextramemory {
    public static void printmatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] transpose(int arr[][],int r,int c) {
       int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++) {
               ans[i][j]=arr[j][i];
            }
        }
   return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter array matrix");
        for(int i=0;i<arr.length;i++)
            for (int j=0;j<arr.length;j++)
                arr[i][j]= sc.nextInt();
        int ans[][]=transpose(arr,r,c);
        printmatrix(ans);

    }
}



