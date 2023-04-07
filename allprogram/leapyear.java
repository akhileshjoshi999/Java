package allprogram;

import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        if(sc%4==0)
            System.out.println("leap year");
    }
}
