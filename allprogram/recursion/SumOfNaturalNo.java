package src.allprogram.recursion;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static int sumseries(int n){
        if(n==0)
            return 0;//sum of zero th element is 0
        if(n%2==0) return sumseries(n-1)-n;
        else return sumseries(n-1)+n;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumseries(n));
    }
}
