package aray;

import javax.swing.*;

public class linearsearch {
    public static void main(String[] args) {
        int a[]={2,34,45,56,66};
        int searchelement=564;
        int temp=0;
        for (int i=0; i<a.length;i++){
            if(a[i]==searchelement) {
                System.out.println("item is present");
temp=temp+1;
            }
        }
if(temp==0)
    System.out.println("item is not present");

}
}

