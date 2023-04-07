package src.allprogram.ooops;

public class callbyValue {
    int roll;
    public void change(int roll){
 roll=34;
        System.out.println("values in method-> "+roll);
    }
    public static void main(String[] args) {
       callbyValue st=new callbyValue();
       st.roll=23;
        System.out.println("value brfore change ->"+st.roll);
       st.change(23);
        System.out.println("value after change ->"+st.roll);
    }
}
