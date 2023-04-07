package allprogram;

import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
       int pow=1;
       for(int i=1;i<b;i++){ //b bar loop chlega
           pow*=n;//
           //pow=pow*n; same as pow*=n;
       }
        System.out.println(pow);
       }

}
