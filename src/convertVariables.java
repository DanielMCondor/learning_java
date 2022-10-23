public class convertVariables {
    public static void main(String[] args) {
        // TODO: 2022-10-22 convert String to primitive data type
        String _boolean = "true";
        String _decimal = "2.56";
        String _int = "395";
        String _float = "2.56e2f";

        System.out.println("boolean: " + Boolean.parseBoolean(_boolean));
        System.out.println("double: " +Double.parseDouble(_decimal));
        System.out.println("int: " + Integer.parseInt(_int));
        System.out.println("floar: " +Float.parseFloat(_float));

        System.out.println("====================================");
        System.out.println("====================================");

        // TODO: 2022-10-22 convert primitive to String
        boolean correct = true;
        double statureDouble = 1.55;
        int age = 25;
        float statureFloat = 155f;

        System.out.println("String: "+Boolean.toString(correct));
        System.out.println("String: "+Double.toString(statureDouble));
        System.out.println("String: "+Integer.toString(age));
        System.out.println("String: "+ Float.toString(statureFloat));


    }
}
