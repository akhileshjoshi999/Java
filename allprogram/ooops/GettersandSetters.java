package src.allprogram.ooops;

public class GettersandSetters {
    private int name;
    private int no;

    public int getName() {
        return name;
    }
    public int getroll(){
        return no;
    }
public void setsetroll(int no){
        this.no=no;


}
    public void setName(int name) {
        this.name = name;
    }




    public static void main(String[] args) {
        GettersandSetters st=new GettersandSetters();
        st.setName(45);
        System.out.println(st.name);
        System.out.println(st.no);
    }
}
