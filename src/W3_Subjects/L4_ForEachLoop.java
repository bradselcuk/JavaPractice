package W3_Subjects;

public class L4_ForEachLoop {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6};
        for( int x :num){
            System.out.println(x);
        }
        String[]cars={"Volvo", "BMW", "Ford", "Mazda"};
        for(String y:cars){
            System.out.println(y);
        }
    }
}
