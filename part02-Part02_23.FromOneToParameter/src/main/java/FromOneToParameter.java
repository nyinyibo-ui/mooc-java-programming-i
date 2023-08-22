

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(7);
    }

    public static void printUntilNumber(int number){
        int i=1;
        while (i<=number){
            System.out.println(i);
            i++;
        }
    }
}
