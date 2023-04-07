package allprogram.diff;
import allprogram.*;



class tree extends accessmodi{
   public static void main(String[] args) {
       tree aa = new tree();
       aa.printclass();//protected modifier ko inheritence me use kr skte hai
       System.out.println("outside package within subclass:" + aa.string1);
   }}
       class hello {
           public static void main(String[] args) {
               accessmodi str = new accessmodi();
             //  str.printclass();
               System.out.println("outside package:"+str.string1);

           }
       }


