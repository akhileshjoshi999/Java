package src.allprogram.Strings;

public class ToggleStringbuilder {
    public static void toggle(StringBuilder dc) {
        for (int i = 0; i < dc.length(); i++) {

            boolean flag = true;//capital
            char ch = dc.charAt(i);//first character
            if(ch==' ')continue;
            int ascii = (int) ch;//gives ascii value of first character
            if (ascii >= 97)
                flag = false;
            if (flag == true) {
                ascii += 32;
                char chh = (char) ascii;//converting int to char
                dc.setCharAt(i, chh);
            } else {
                ascii -= 32;
                char dh = (char) ascii;
                dc.setCharAt(i, dh);
            }

        }
    }
    public static void main(String[] args) {
        StringBuilder dc=new StringBuilder("AkhiLESH JosHI");
      toggle(dc);
        System.out.println(dc);

    }
}
