package allprogram;

import java.util.Scanner;

public class average {
    void average(int a, int b ,int c){
        System.out.println("average of three no:"+(a+b+c)/3);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average av=new average();
        av.average(a,b,c);
    }
}
