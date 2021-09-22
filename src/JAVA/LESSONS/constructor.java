package JAVA.LESSONS;

public class constructor {
    int x;

    public constructor() {
        x = 5;
    }

    public static void main(String[] args) {
        constructor a = new constructor();
        System.out.println(a.x);
    }

}
