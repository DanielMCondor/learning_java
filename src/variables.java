public class variables {
    public static void main(String [] args) {
        // TODO: 2022-10-16 declare variables (String, Integer)
        String name = "Daniel";
        Integer age = 25;
        String phrase = "Hola, mi nombre es "+name+" y tengo "+ String.valueOf(age) + " años.";
        System.out.println(phrase);
        System.out.println(phrase.getClass().getName());

        // TODO: 2022-10-22 declare variables (int, float, double, long)
        int ninth = 9;
        int seven = 7;
        float statuteFloat = 1.55f;
        double statureDouble = 1.55;
        long longs = 400000000;

        // TODO: 2022-10-22 declare type char unicode (&)
        char symbolUnicode = '\u0026';
        System.out.println("Simbolo unicode: " + symbolUnicode);

        // TODO: 2022-10-22 declare type char ASCII (&)
        char symbolAscii = 38;
        System.out.println("Simbolo ASCII: "+ symbolAscii);

        // TODO: 2022-10-22 declare type char Car
        char symbolCar = '&';
        System.out.println("Simbolo Car: " + symbolCar);

        // TODO: 2022-10-22 special characters or escape sequences
        char lineBreak = '\n';
        char recoilLine = '\b';
        char tabulator = '\t';
        char startOfLine = '\r';
        char newPage = '\f';
        char quotes = '\"';
        char singleQuotes = '\'';
        char backslash = '\\';

        // TODO: 2022-10-22 declare variables type boolean
        boolean _true = true;
        boolean _false = false;
        
        // TODO: 2022-10-22 declare variables constants
        double VALOR_PI = 3.141592653589793;
        System.out.println("valor pi: " + VALOR_PI);

        // TODO: 2022-10-22 declare an array
        int[] array = new int[0];

        // TODO: 2022-10-22 number system: (decimal, binary, hexadecimal, octal)
        int number = 450;
        String binaryNumber = Integer.toBinaryString(number);
        String hexadecimalNumber = Integer.toHexString(number);
        String octalNumber = Integer.toOctalString(number);

        System.out.println("Nuestro numero es: " + number);
        System.out.println("Numero en binario: "+ binaryNumber);
        System.out.println("Convertir de binario a nuestro numero: "+ 0b111000010); // TODO: 2022-10-22  0b111000010 -> 0b (prefix for binary)

        System.out.println("Numero en hexadecimal: " +  hexadecimalNumber);
        System.out.println("Convertir de hexadecimal a nuestro numero: " + 0x1c2); // TODO: 2022-10-22 0x1c2 -> 0x (prefix for hexadecimal)

        System.out.println("Numero en octal: "+ octalNumber);
        System.out.println("Convertir de octal a nuestro numero: "+ 0702); // TODO: 2022-10-22 0 -> (prefix for octal)
    }
}
