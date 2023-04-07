package src.allprogram.recursion;

public class greatestCommonDivicsior {
    public static int iGCD(int x,int y) {
    if(y==0)
        return x;
    return iGCD(y,x%y);
    }
    public static void main(String[] args) {
//        for(int i=1;i<12;i++)
//        {
//            if(12%i==0&&15%i==0)
//                System.out.println(i);
        System.out.println(iGCD(12,15));
    }
    }

