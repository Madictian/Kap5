public class Opg5_4 {
    public static void main(String[] args) {
        //fahrenheit 9/5 + 32
        int inches = 0;
        double centimeters = 0;

        System.out.println("inches         centimeters");

        for (inches = 0; inches <= 100; inches++){
            centimeters = (inches * 2.54);
            System.out.println(inches + "                  " + centimeters);
        }

    }
}
