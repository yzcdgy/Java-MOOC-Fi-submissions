

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number){
        for(int x = number; x > 0; x--){
            System.out.println(x);
        }
    }

}
