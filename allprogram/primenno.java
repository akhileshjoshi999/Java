package allprogram;

import java.util.Scanner;

public class primenno {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        //int temp=0;
        boolean br=false;
        for(int i=2;i<a/2;i++){
            if(a%i==0) {
                //temp = temp + 1;
               br=true;
                break;
            }
        }

       // if(temp==0) {
        if(!br){
            System.out.println("no is  prime ");
        }else
            System.out.println("no is  not prime");
    }
}
