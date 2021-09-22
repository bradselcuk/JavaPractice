package JAVA.LESSONS;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class Day_2_RemoveDuplicate {
    public static void main(String[] args) {


        String[] sentence = {"A", "A", "B", "B", "C"};
        Set<String> remdup = new TreeSet<>(Arrays.asList(sentence));
        System.out.println(remdup);
//----------------------------------------------------------------------
        String word = "AAABBBCCCCCCDDDDDDEEEEH";
        String[] arr = word.split("");
        Set<String> remdup1 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(remdup1);

}
}
