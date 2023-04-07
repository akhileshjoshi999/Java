package allprogram;

public class leapyearwihtoutmethod {
    public static void main(String[] args) {
        int year=400;
        if(year%400==0 ||year%4==0&&year%100!=0)
            System.out.println(year+"is leap");
        else System.out.println(year+"is not leap");
    }
}
