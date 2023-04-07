package src.aray.twodarray;

import java.util.Scanner;

public class transposematrix {
    public static void printmatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void swap(int arr[][],int r,int c) {
for(int i=0;i<c;i++){//row column ban chuki hai isliye i<c likha ni to i<r hota
    for(int j=i;j<r;j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
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
        swap(arr,r,c);
        printmatrix(arr);

    }
    }

