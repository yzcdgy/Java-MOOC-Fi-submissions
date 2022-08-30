

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int number){
        for(int x = 1; x <= number; x++){
            System.out.println(x);
        }
    }

}
