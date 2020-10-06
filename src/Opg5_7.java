public class Opg5_7 {
    public static void main(String[] args) {
        double tuition_0 = 10000;
        double new_tuition = 0;
        double tuition_10 = 0;
        double tuition_14 = 0;

        for (int n = 1; n <= 10; n++){
            new_tuition = tuition_0 * 1.06;
            tuition_10 = new_tuition + tuition_10;
            tuition_0 = new_tuition;
        }

        System.out.println("tuition after 10years = " + tuition_10);


        for (int n_2 = 1; n_2 <= 4; n_2++){
            new_tuition = tuition_0 * 1.06;
            tuition_14 = new_tuition + tuition_14;
            tuition_0 = new_tuition;
        }

        System.out.println("And the following 4 years will be: " + tuition_14 );

    }
}
