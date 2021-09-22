package JAVA.LESSONS;

public class Day_1_StringReverse {
    public static void main(String[] args) {

        String a = "Java is Fun";// way1
        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb.reverse());

        String b = "Bulent Selcuk";  // way2
        String reverse = "";
        for(int i=b.length()-1; i>=0; i--){
            //reverse+=b.substring(i,i+1);
            reverse=reverse+b.substring(i,i+1);
        }
        System.out.println(reverse);

        String name5 = "Java is Easy"; // way3
        for(int i = name5.length()-1; i>0; i--){
            System.out.print(name5.charAt(i));
        }

    }
}
