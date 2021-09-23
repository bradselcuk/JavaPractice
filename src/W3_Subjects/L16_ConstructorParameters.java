package W3_Subjects;

public class L16_ConstructorParameters {
    int modelYear;
    String modelName;

    public L16_ConstructorParameters (int year, String name){
        modelName = name;
        modelYear = year;
    }

    public static void main(String[] args) {
        L16_ConstructorParameters myObj = new L16_ConstructorParameters(1969, "Mustang");
        System.out.println(myObj.modelYear+" "+myObj.modelName);
    }
}
