package allprogram;

import java.util.Scanner;

public class addtwonousingmethod {

    public  int add(int a, int b){
        int addition= a+b;
        return addition;
    }
    public static void main(String[] args) {
        addtwonousingmethod ne=new addtwonousingmethod();
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
       int abb=ne.add(a,b);
        System.out.println(abb);
    }
}
