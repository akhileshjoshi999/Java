package src.aray.programs;

import java.util.Scanner;

public class prefixsumofvaluesinagivenrange {
    public static void printarray(int arr[]){
        for (int i=1;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void prefixsum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int total = sc.nextInt();
        int arr[] = new int[total];
        System.out.println("enter array element");
        for (int i = 1; i <total; i++){
            arr[i] = sc.nextInt();
    }
        prefixsum(arr);
        printarray(arr);
        System.out.println("enter queries");
        int q= sc.nextInt();

        while(q>=0){
            System.out.println("enter left");
            int left=sc.nextInt();
            System.out.println("enter right");
            int right=sc.nextInt();

          int prefixrange=  arr[right]-arr[left-1];//means total value me se left ki value minus krke prefix nikal skte hai ek range me
            System.out.println(prefixrange);
            q--;
        }

    }
}
