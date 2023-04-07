package src.allprogram.Strings;

public class StringReverse {
    public void reverse(String s){
      char[]ch=s.toCharArray() ;
      for(int i=s.length()-1;i>=0;i--){
          System.out.println(ch[i]);
      }
    }
    public static void reverseStringbuilder(StringBuilder s){
        s.reverse();

    }

    public static void main(String[] args) {
        String s="akhilesh";
        StringReverse sc=new StringReverse();
        sc.reverse(s);
        StringBuilder ssc=new StringBuilder(s);
        reverseStringbuilder(ssc);
        System.out.println(ssc);
        System.out.println(s);


    }
}

