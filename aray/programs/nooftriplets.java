package aray.programs;

import java.util.Scanner;

public class nooftriplets {
    public static int triplets(int[] arr, int target){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
    return ans;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int total=sc.nextInt();
        int arr[]=new int [total];

        System.out.println("enter array element ");
        for (int i=0;i<total;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target=sc.nextInt();
        System.out.println(triplets(arr,target));
}}
