import java.util.Arrays;


class Animal {
    String name;

    void walk() {
        System.out.println(name + " walking");
    }
}
public class Main {
    public static void main(String[] args) {
        byte b = -127; // 1 byte -128 -> 127
        short s = 32767; // 2 byte -32768 -> 32767
        int number = Integer.MIN_VALUE; // 4 byte
        float f = 15.265616365166f; // 4 byte 6
        double d = 1561.65156165; // 8 byte
        long l = 151_651L; // 8 byte
        char ch = 'c'; // 2 byte
        char un = '\u0908';
        String name = "kfljds;flkdjsa;";

        System.out.println(name);
        System.out.println(un);
        System.out.println(ch);
        System.out.println(Double.PRECISION);
        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
        System.out.println(s);
        System.out.println(number);
        System.out.println(l);


        float[] arr = new float[]{15f, 20f, 30f};

        System.out.println(Arrays.toString(arr));

        Animal dog = new Animal();
        dog.name = "Rex";
        dog.walk();

    }
}