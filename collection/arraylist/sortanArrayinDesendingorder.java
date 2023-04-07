package src.collection.arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class sortanArrayinDesendingorder {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("rohit ");
        list.add("ishan");
        list.add("virat");
        list.add("surya");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
