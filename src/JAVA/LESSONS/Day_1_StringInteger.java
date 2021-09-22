package JAVA.LESSONS;

public class Day_1_StringInteger {
    public static void main(String[] args) {

        String first = "Mike";
        String second = new String ("Suzan");

        char[]ch={'S','c','o','t','t'};
        String third = new String(ch);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

//-----------------------------------
        String name = "Bulent";
        String name2 = new String ("Meltem");

        name.concat("Bulent");
        name=name.concat(" Selcuk");
        System.out.println(name);
//-----------------------------------

      int num =123;
      String abc = Integer.toString(num);
      System.out.println(abc);

      int nums = 1234;
      String k = String.valueOf(nums);
      System.out.println(nums);

      String number = "10";
      int result = Integer.parseInt(number);
      System.out.println(number);

      String number1 = "120";
      int result1 = Integer.valueOf(number1);
        System.out.println(result1);

    }
}
