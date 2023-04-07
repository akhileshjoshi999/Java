package src.aray.twodarray;

import java.util.Scanner;

public class addmatrixinputfromuser {

    public static void printmatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){//j array h arr[i]ka
                System.out.print(arr[i][j]+" ");
    }
        System.out.println(" ");
}
    }
public  static void addmatrix(int a[][],int r,int c,int b[][],int r1,int c1){
        if(r!=r1||c!=c1) {
            System.out.println("can't add different col and row matrix");
            return;
        }
    int sum[][]= new int [r][c];
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            sum[i][j]= a[i][j]+b[i][j];
    printmatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row and column of matrix 1");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter matrix values");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
             a[i][j]=sc.nextInt();
        System.out.print("enter the row and column of matrix 2");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int b[][]=new int[r1][c1];
        System.out.println("enter matrix values");
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                b[i][j]=sc.nextInt();
        System.out.println("matrix 1");
        printmatrix(a);
        System.out.println("matrix 2");
        printmatrix(b);
        System.out.println("addition of two matrix");
        addmatrix(a,r,c,b,r1,c1);


    }
}
