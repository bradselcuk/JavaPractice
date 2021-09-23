package W3_Subjects;

public class L14_Constructors {
    int x ; // create calls attribute

    //Create a class constructor for the Main class
    public L14_Constructors(){
        x = 5; // Set Initial valoue for the class attribute x
    }

    public static void main(String[] args) {
        L14_Constructors myObj = new L14_Constructors();// Create an object of class Main(This call the constructor)
        System.out.println(myObj.x);//Print the value of x

    }

}
