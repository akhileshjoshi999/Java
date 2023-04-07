package src.allprogram.Strings;

public class ReverseEachWord {
    public  static String reverseword(String str){
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            }
else {
    sb.reverse();
    ans +=sb;
    ans+=' ';
   sb.delete(0,sb.length());
            }
    }
       // System.out.println(sb);
        sb.reverse();
        ans+=sb;
    return ans;
    }

    public static void main(String[] args) {
        String str="i am online educator";
String st=reverseword(str);
        System.out.println(st);

    }
}
