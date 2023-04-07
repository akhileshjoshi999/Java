package allprogram;

import java.util.Scanner;

public class printnousingwhile {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int se=sc.nextInt();

        int num=1 ,n=0;
        while(num<=se){
            n=num*(num+1)/2;

        num++;
    }
        System.out.println(n);
    }
}
