package W3_Subjects;

public class L6_Arrays {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6};
        for(int x:num){
            System.out.println(x);
        }
//
        int[][] myNumbers = {{1,2,3,4,5},{6,7,8,9,10}};
        int y = myNumbers[1][1];
        System.out.println(y);

//
        int[][] numbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for(int i = 0; i < numbers.length; i++){
            for(int j=0; j< numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
