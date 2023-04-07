package src.allprogram.Strings;

public class pallindrome {
    public static void pallind(String s){
        int i=0;
        int j=s.length()-1;
        int temp=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
             temp++;
break;
            }
            i++;
            j--;
        }
       if(temp==0){
           System.out.println("string is pallindrome");

       }
       else System.out.println("string is not pallindrome");
    }
    public static void main(String[] args) {
String s="absddsba";
pallind(s);
    }
}
