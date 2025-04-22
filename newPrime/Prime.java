public class Prime {

    // a fucntion to print factors of a number

    public static void printFactors(int num) {
        System.out.println("Factors of " + num + " : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int maxInput = 100;

        for (int i = 2; i <= maxInput; i++) {
            int num = i;
            if (isPrime(num)) {
                System.out.println(num);
            }
        }

        // printFactors(7);
    }

}
