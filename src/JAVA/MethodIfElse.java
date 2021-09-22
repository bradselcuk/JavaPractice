package JAVA;

public class MethodIfElse {

    static void checkAge(int age){

        if(age<18){
            System.out.println("Acces Denied");
        }else{
            System.out.println("Acces Allowed");
        }
    }
    public static void main (String[]args){
        checkAge(30);
    }
}
