public class Main {
    public static void main(String[] args) {
        byte a = (byte)1209; // 1 byte 8 bit signed -128 127
        byte b = -110;
        byte c = (byte)(a + b);

        Byte d = a;
        Byte newOne = new Byte((byte)16);

        byte f = (byte)(newOne.byteValue() + a);

        System.out.println("Byte max value " + Byte.MAX_VALUE);
        System.out.println("Byte min value " + Byte.MIN_VALUE);
        System.out.println("Byte how many bit "  + Byte.SIZE);
        System.out.println("Byte how many byte " + Byte.BYTES);
        System.out.println("Byte type " + Byte.TYPE);

        System.out.println("conver to string " + Byte.toString(a));  // output of toString functions is this "-71"
        System.out.println(Byte.compare(a, b));
        System.out.println(newOne.equals(a));
        float floatValue = newOne.floatValue();

        System.out.println("The floatValue of newOne is " + floatValue);

        double doubleValue = newOne.doubleValue();

        System.out.println("The double value is " + doubleValue);

        System.out.println(newOne.getClass());
        System.out.println(newOne.toString());

        System.out.println("Parse byte " + Byte.parseByte("106", 8));
        System.out.println(Byte.toUnsignedInt(a));
        String dataType = Byte.valueOf("106").toString();

        System.out.println(dataType.getClass());
        System.out.println(d);
        System.out.println("New one is " + newOne);

        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println(a);
    }
}