package W3_Subjects;

public class L13_ClassMethods {
    //Static Medhod
    static void myStaticMedhod() {
        System.out.println("Static medhods can be called without creating objects");
    }

    //Public Medhod
    public void myPublicMedhod() {
        System.out.println("Public medhods must be called bt creating objects");
    }

    //Main Medhods
    public static void main(String[] args) {
        myStaticMedhod();// Call static medhod
        //myPublicMedhod(); This compile error

        L13_ClassMethods myObj = new L13_ClassMethods(); // Create an object of L13_ClassMethods(Main)
        myObj.myPublicMedhod(); // Call the public medhod on the object
    }
}