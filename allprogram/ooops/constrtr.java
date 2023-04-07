package src.allprogram.ooops;

    public class constrtr{
        String name;
        int rollno;
        double percnentage;
   String address;


        constrtr(String name , int rollno,double percentage){
            this.name=name;
            this.rollno=rollno;
            this.percnentage=percentage;

        }


        public  void display() {
            System.out.println("name:"+name+" " +"rollno:"+rollno +" "+"percentage:" +" "+percnentage);
        }
        public  void change(constrtr s3){
            s3.address="saraswati puram";
        }
        public static void main(String[] args) {
            constrtr st=new constrtr("akhilesh",1,34);

            constrtr st2=new constrtr("rollo",2,56);



            st.display();
            st2.display();


        }
    }


