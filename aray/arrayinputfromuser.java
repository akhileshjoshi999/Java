package aray;

import java.util.Scanner;

public class arrayinputfromuser {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter array total elements");
        int total=sc.nextInt();
        int arr[]=new int[total];
        System.out.println("enter elements");
        for(int i=0;i<total;i++)
        {
            arr[i]=sc.nextInt();
        }

    }
}
