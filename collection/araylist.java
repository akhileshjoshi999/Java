package collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class araylist {
    public static void main(String[] args) {
ArrayList<String> a =new ArrayList<>();
a.add("akhilesh");
a.add("akhilesh");
a.add("alesh");
a.add("piap");
//for(String as:a)
        Collections.sort(a);
        Iterator itr=a.iterator();
        while(itr.hasNext())


        System.out.println(itr.next());
        a.set(1,"rohit");//replace index 1 position element

        System.out.println(a);
        ArrayList<String>arr=new ArrayList<>();
        arr.add("rahul ");
        arr.add("rohit ");
        arr.add("virat ");
        arr.add("sky ");
        arr.add("pandya ");
        arr.add("pant");
        arr.add("axar");
        arr.add("ashwin");
       // Collections.sort(arr);//
       //
        System.out.println(arr);
        arr.add(7,"bumrah");
arr.addAll(a);
            System.out.println(arr);
            a.remove(2);// remove all the elements of 2 index no
            System.out.println(a);
            a.removeAll(arr);//remove all the elements of arr
       //  arr.clear();// remove all the elements
            System.out.println(arr);// remove all the elements
            System.out.println(arr.isEmpty());
            arr.addAll(a);
            System.out.println(arr);
            Collections.sort(arr);
            System.out.println(arr);
            Collections.reverse(arr);// reverse arraylist
            System.out.println(arr);


    }

}
