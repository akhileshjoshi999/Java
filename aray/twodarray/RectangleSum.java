package src.aray.twodarray;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class RectangleSum {
    public static void printmatrix(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.println(arr[i][j]);


        }}
    public static void prefixsumRow(int [][]arr){
            for(int i=0;i<arr.length;i++)
                for (int j = 1; j < arr.length; j++) {
arr[i][j]+=arr[i][j-1];
                }
        }
        public static void prefixsumColumn(int [][]arr){
        prefixsumRow(arr);
        for(int j=0;j<arr.length;j++)
            for(int i=1;i<arr.length;i++){
                arr[i][j]+=arr[i-1][j];

            }

        }
        public static int rectangleSum(int arr[][],int n1, int m1,int n2,int  m2){
        //n1 row se n2 row tak,m1 col se m2 col tak
        int ans=0, sum=0,up=0,left=0,upleft=0;
        prefixsumColumn(arr);

        sum=arr[n2][m2];
        if(n1>=1)
        up=arr[n1-1][m2];
        if(m1>=1)
        left=arr[n2][m1-1];
        if(m1>=1&&n1>=1)
upleft=arr[n1-1][m1-1];
ans=sum-up-left+upleft;

       return ans;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int r=sc.nextInt();
        System.out.println("enter column");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
        System.out.println("enter matrix");
        for (int i=0;i<r;i++)
            for(int j=0;j<c;j++)
               arr[i][j]=sc.nextInt();
        System.out.println("enter rectangle boundries");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int n2=sc.nextInt();
        int m2=sc.nextInt();
int ans=rectangleSum(arr,n1,m1,n2,m2);
        System.out.println(ans);
    }
}
