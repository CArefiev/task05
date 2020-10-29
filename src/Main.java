public class Main {

    public static Double factorial(Integer a) {

        double fact = 1;
        for (int i = 1; i <= a; i++) {

            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
}
