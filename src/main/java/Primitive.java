public class Primitive {
    public static void main (String[] args) {
        int intValue = 50;
        byte byteValue = 10;
        short shortValue = 20;
        long longTotal = 50000L + 10L* (intValue+shortValue+byteValue);
        short shortTotal =(short) (1000 + 10*
                (intValue+shortValue+byteValue));
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float minimum value ="+ myMinFloatValue);
        System.out.println("float maximum value ="+myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value ="+ myMinDoubleValue);
        System.out.println("double maximum value ="+myMaxDoubleValue);
        double myDoubleValue = 100d;
        double myDoubleTotal = myDoubleValue*2d;
        System.out.println(myDoubleValue);

        double myLb = 500d;
        double myKg = myLb*0.45359237;
        System.out.println("IN KG=" +myKg);

        char myChar ='D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        double myFerstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotal = myFerstValue + mySecondValue * 100d;
        System.out.println(myTotal);
        double theRemainder = myTotal % 40.00d;
        System.out.println(theRemainder);
        boolean myRemainder = theRemainder == 0 ? true : false;
        System.out.println("myRemainder ="+myRemainder);
        if (!myRemainder) {
            System.out.println("got some Remainder");
        }












    }
}
