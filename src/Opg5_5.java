public class Opg5_5 {
    public static void main(String[] args) {

        double fahrenheit = 20;
        System.out.printf("%-10s%-10s%-5s%-15s%-10s\n", "celsius", "fahrenheit", " | ", "fahrenheit", "celsius");

        for (double i = 0; i <= 100; i++){
            fahrenheit += 5;
            System.out.printf("%-10s%-10s%-5s%-15s%-10s\n", i, (i * 9 / 5 + 32), " | ", fahrenheit, ((fahrenheit - 32)) * 5 /  9);
        }
    }
}
