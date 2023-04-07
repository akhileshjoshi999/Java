package src.allprogram.Strings;
import java.util.*;
public class stringEqualmethod {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String ("hello");
        System.out.println(s1==s3);
        String s4=new String("hello");
        System.out.println(s3==s4);
        System.out.println("equals method"+ " "+s3.equals(s4));
    }


}
