package src.allprogram.Strings;

public class Stringlearn {
    public static void main(String[] args) {
        String str="abcd";
//        str+="sh";
        System.out.println(str.length());
        System.out.println(str);
        System.out.println("abcd"+10+20);
        System.out.println(10+20+"abcd");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++) {
                //str.length tak chalega kyoki  (i,j) i se lekar j-1 tak string print krta hai
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
