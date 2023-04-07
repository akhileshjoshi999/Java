package aray.programs;

import java.util.Scanner;

public class rotatearraywithnew {
    public static void printarray(int arr[]){
        for (int i:arr)
            System.out.println(i);
    }
    public static int[] rotate(int arr[],int k){
       int n =arr.length;
        int ans[]=new int[n];
        int a=0;
        k=k%n;
        for(int i=n-k;i<n;i++){
            ans[a++]=arr[i];
        }
    for(int i=0;i<n-k;i++){
        ans[a++]=arr[i];

    }
//for (int i=0;i<arr.length;i++)//agar return type void hota to ye karte
        //  System.out.println(ans[i]);
    return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int total=sc.nextInt();
        int []arr=new int [total];
        System.out.println("enter array");
        for (int i=0;i<total;i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("enter k");
            int k=sc.nextInt();
        System.out.println("original array");
            printarray(arr);
        System.out.println("array after change");
            int []ans=rotate(arr,k);
            printarray(ans);

        }
    }

