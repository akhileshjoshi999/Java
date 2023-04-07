package allprogram;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        switch(n) {
            case 1:
                System.out.println("saturday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            default:
                System.out.println("hell");
        }



        }
    }

