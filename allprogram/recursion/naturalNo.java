package src.allprogram.recursion;

import java.util.Scanner;

public class naturalNo {
    static void printrecursion(int n) {
        if (n == 1){
            System.out.println(1);
        return;
    }
        System.out.println(n);
        printrecursion(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=  sc.nextInt();
      printrecursion(n);
    }
}
