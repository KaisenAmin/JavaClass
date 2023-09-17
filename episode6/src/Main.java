public class Main {
    public static void main(String[] args) {
        int number1 = 150;
        int number2 = -1564;
        int a = 15;

        Integer intObject = Integer.valueOf(number1);

        int addition = a + intObject;

        System.out.println(intObject.byteValue());
        System.out.println(intObject.floatValue());
        System.out.println(intObject.equals(number2));

        System.out.println(Integer.max(15, 16));
        System.out.println(Integer.min(23, 65));

        int myNumber = Integer.parseInt("-15661");
        System.out.println(myNumber + 10);

        System.out.println(Integer.parseUnsignedInt("1111", 2));
        System.out.println(Integer.bitCount(a));

        System.out.println(Integer.reverseBytes(a));
        System.out.println(Integer.highestOneBit(a));
        System.out.println(Integer.lowestOneBit(a));

        String binString = Integer.toBinaryString(15);
        System.out.println(Integer.toHexString(1562));

        System.out.println(intObject.toString());

        System.out.println(binString);

        System.out.println("Addition is " + addition);

        System.out.println("Max value is " + Integer.MAX_VALUE);
        System.out.println("Min value is " + Integer.MIN_VALUE);
        System.out.println("How many bytes " + Integer.BYTES);
        System.out.println("How many bits " + Integer.SIZE);

        System.out.println("Number1 " + (number1 + 10));
        System.out.println("Number2 " + number2);
    }
}