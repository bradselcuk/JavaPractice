package W3_Subjects;

public class L9_MethodOverloading {

    static int plusMethod(int x, int y){
        return x+y;


    }
    static double plusMethod(double x, double y){
        return x+y;
    }



    public static void main(String[] args) {

        int result = plusMethod(20,10);
        double result2 = plusMethod(5.9, 4.8);
        System.out.println(result);
        System.out.println(result2);

    }
}
