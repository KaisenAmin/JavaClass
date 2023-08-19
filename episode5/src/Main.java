public class Main {
    public static void main(String[] args) {
        short a = 156; // 2 byte 16 bit and -32768 to 32767
        short b = 32;
        // primitive data type

        short c = (short)(a + b);

        System.out.println("c is " + c);
        System.out.println("a is " + a);
        System.out.println("b is " + b);


        Short one = 156;
        String numberString = "635";

        System.out.println(one.getClass());
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.TYPE);
        System.out.println(Short.BYTES);

        System.out.println(Short.compare(a, b));
        short numberShort = Short.parseShort(numberString);

        System.out.println(numberShort);

        System.out.println(one.byteValue());
        System.out.println(one.toString());
        System.out.println(one.equals(a));
        System.out.println(one.compareTo(a));

    }
}