package allprogram;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum = 0,digit=0;
        while(n>0){
           digit=n%10;
           //upr wali statement se last digit mil jayegi or niche wale statement me store kar di jayegi
            sum=sum+digit;
           //digit milne or store karne ke bad hume last digit ko remove krna pdega uske liye niche wali statement hai
            n=n/10;

        }
        System.out.println("sum of the digits are"+" "+sum);
}
}
