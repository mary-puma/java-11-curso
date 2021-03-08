public class PositiveNegativeZero {
    public static void main(String[] args){
        checkNumber(50);
        checkNumber(-1000);
        checkNumber(0);
        checkNumber(2000);

    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("POSITIVE");
        }else if (number < 0){
            System.out.println("NEGATIVE");
        }else {
            System.out.println("ZERO");
        }

    }

}
