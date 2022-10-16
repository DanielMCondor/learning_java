public class variables {
    public static void main(String [] args) {
        // TODO: 2022-10-16 declare de variables
        String name = "Daniel";
        Integer age = 25;
        String phrase = "Hola, mi nombre es "+name+" y tengo "+ String.valueOf(age) + " años.";
        System.out.println(phrase);
        System.out.println(phrase.getClass().getName());
    }
}
