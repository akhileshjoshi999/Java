package src.allprogram.Strings;

public class Stringbuilder {
    public static void main(String[] args) {

        StringBuilder sc=new StringBuilder("hello");
        //we can change a individual character in stringbuilder but not in string
        sc.setCharAt(0,'m');
        System.out.println(sc);
        sc.insert(0,'M');
        sc.deleteCharAt(5);
        System.out.println(sc);
    }
}
