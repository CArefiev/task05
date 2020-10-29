public class Main {

    static void sum (int a, int b) {

        System.out.println("The summ of a and b is: " + a + b);
    }

    static void prod (int a, int b) {

        System.out.println("The product of a and b is: " + a * b);
    }

    public static Double factorial(Integer a) {

        double fact = 1;
        for (int i = 1; i <= a; i++) {

            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {

        System.out.println(factorial(5));
        sum(10,5);
        prod(10,5);
        
    }
}
