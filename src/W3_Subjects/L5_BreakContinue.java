package W3_Subjects;

public class L5_BreakContinue {
    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        //
        for(int i=0; i<=10; i++){
            if (i==4){
                continue;
            }
            System.out.println(i);
        }
    }
}
