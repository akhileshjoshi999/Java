package aray;

import java.util.Scanner;

public class secondlargestelement {
    public static int seclarge(int arr[]){
        int min=Integer.MIN_VALUE;//minimum value 0 ni li kyonki agar array me negative value ajati to sb galat ho jta
        for (int i=0;i<arr.length;i++){
            if(min<arr[i])
                min=arr[i];

        }
    return min;
    }
public static int secondmax(int arr[]){
        int min=seclarge(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[j]==min)
                arr[j]=Integer.MIN_VALUE;

        }
int secl=seclarge(arr);
        return secl;

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
        System.out.println("secondmax");
        System.out.println(secondmax(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
}}
