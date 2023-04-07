package allprogram;

import java.util.Scanner;

public class leapyearornot {
    public static void leapyear(int year){
    if( year%400==0)
        System.out.println(year+"is a leap year");
    else if(year%100==0)
        System.out.println(year+"is not a leap year");
    else if(year%4==0)
        System.out.println(year+"is leap year");
    else
        System.out.println("is not a leap year");


    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter digit");
        int a=scanner.nextInt();

        leapyear(a);


    }}

