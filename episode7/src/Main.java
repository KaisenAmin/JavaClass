
public class Main {
    public static void main(String[] args) {
        float floatValue1 = 15.3261651651f;
        float floatValue2 = 12.36515666f;

        System.out.println("Addition is " + (floatValue1 + floatValue2));

        System.out.println("Float type " + Float.TYPE);
        System.out.println("Float size " + Float.SIZE);
        System.out.println("Float Byte " + Float.BYTES);
        System.out.println("Exponent Max " + Float.MAX_EXPONENT);
        System.out.println("Exponent Min " + Float.MIN_EXPONENT);
        System.out.println("Max value is " + Float.MAX_VALUE);
        System.out.println("Min value is " + Float.MIN_VALUE);
        System.out.println("Float value " + Float.valueOf(floatValue1));

        System.out.println("Value1 is " + floatValue1);
        System.out.println("Value2 is " + floatValue2);


        float one = (float)Math.pow(2, Float.MAX_EXPONENT);
        float two = (float)Math.pow(2, Float.MIN_EXPONENT);

        float isNan = Float.POSITIVE_INFINITY;

        System.out.println(Float.isInfinite(isNan));
        System.out.println("is infinite ? " + Float.isInfinite(one));
        System.out.println("one is " + one);
        System.out.println("two is " + two);

        String hexone = Float.toHexString(one);
        String hextwo = Float.toHexString(two);

        System.out.println("hex one is " + hexone);
        System.out.println("hex two is " + hextwo);

        System.out.println("sum of two number " + Float.sum(floatValue1, floatValue2));
        System.out.println("min of two number " + Float.min(floatValue1, floatValue2));
        System.out.println("max of two number " + Float.max(floatValue1, floatValue2));

        Float obj = Float.parseFloat("15.326"); // autboxing

        System.out.println(Float.parseFloat("15.326"));

        System.out.println(obj.doubleValue());
        System.out.println(obj.equals(floatValue1));
        System.out.println(Float.compare(floatValue1, floatValue2));



    }
}