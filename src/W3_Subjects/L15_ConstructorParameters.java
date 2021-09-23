package W3_Subjects;

public class L15_ConstructorParameters {

    int x;

    public L15_ConstructorParameters(int y){
        x = y;
    }

    public static void main(String[] args) {
        L15_ConstructorParameters myObj = new L15_ConstructorParameters(5);
        System.out.println(myObj.x);
    }
}
