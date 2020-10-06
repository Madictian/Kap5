public class Opg5_6 {
    public static void main(String[] args) {

        double sqmeters = 25;
        System.out.printf("%-10s%-10s%-5s%-15s%-10s\n", "ping", "sqmeters", " | ", "sqmeters", "ping");

        for (double i = 0; i <= 100; i++){
            sqmeters += 5;
            System.out.printf("%-10s%-10.3f%-5s%-15s%-10.3f\n", i, i * 3.305, " | ", sqmeters, sqmeters / 3.305);
        }
    }
}
