public class Opg5_3 {
    public static void main(String[] args) {
        //fahrenheit 9/5 + 32
        int celsius = 0;
        int fahrenheit = 0;

        System.out.println("Celsius         Fahrenheit");

        for (celsius = 0; celsius <= 100; celsius++){
            fahrenheit = ((celsius * 9) / 5) + 32;
            System.out.println(celsius + "                  " + fahrenheit);
        }

    }
}
