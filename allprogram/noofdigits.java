package allprogram;

import java.util.Scanner;

public class noofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numofdigits=0;
        int store=n;
while(n>0){
        n=n/10;
        numofdigits++;
    }
        System.out.println("no ofdigits in" +"  "+store+" "+"is:"+"  "+numofdigits);
}}
