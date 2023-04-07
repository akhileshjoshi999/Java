package src.aray.twodarray;

import java.util.Scanner;

public class rotateTwoDarrayNintryDegree {
    public static void printmatrix(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
public static void reverse(int[] arr)
{
int i=0;
int j=arr.length-1;
while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}

}
   public static void transpose(int[][] arr, int r, int c){
           for(int i=0;i<c;i++){
               for (int j=i;j<r;j++){
                   int temp=arr[i][j];
                   arr[i][j]=arr[j][i];
                   arr[j][i]=temp;
               }

           }
       for (int i=0;i<r;i++)
           reverse(arr[i]);//it means 1D array or we can say that first row
       }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int r=sc.nextInt();
        System.out.println("Enter column");
        int c=sc.nextInt();
        int[][] arr =new int[r][c];
        System.out.println("enter matrix elements");
        for (int i=0;i<arr.length;i++)
            for (int j=0;j<arr.length;j++)
                arr[i][j]=sc.nextInt();
        transpose(arr,r,c);
        printmatrix(arr);
    }
}
