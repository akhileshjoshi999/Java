package src.string;

public class Stringoccurance {


    public static void main(String[] args) {
        String str="iamlearning";
        System.out.println(str);
        char[]ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
        System.out.println(ch[i]); }
        char c=str.charAt(5);
            System.out.println("str prestent at index no="+c);
        System.out.println(ch.length);
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(2));
    }
}
