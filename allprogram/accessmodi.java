package allprogram;

public class accessmodi {
     public String string1="hello boy what are you doing?";
 protected void printclass(){
    System.out.println("within class:"+string1);
}
    public static void main(String[] args) {
    accessmodi str=new accessmodi();
    str.printclass();
        System.out.println("within class:|"+str.string1);
        System.out.println(str);
         access str2=new access();
        str2.printfromoutsideclass();
    }
}
class access{
void printfromoutsideclass(){

accessmodi str=new accessmodi();
    System.out.println("within same package but subclass:"+str.string1);

}
}
