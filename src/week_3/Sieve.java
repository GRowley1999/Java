package week_3;

public class Sieve {

    public static void main(String[] args) {
        int n = 20;

        // Fill the numbers array
        int[] sieved_numbers = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            sieved_numbers[i] = i + 2;
        }

        int p = 2;
        boolean firstOutputNumber = true;

        while (p < n) {
            // Add a space only after the first number has been output
            if (firstOutputNumber == false) {
                System.out.print(" ");
            }
            System.out.print(p);
            firstOutputNumber = false;

            // Sieve the remaining numbers
            for (int i = 0; i < sieved_numbers.length; i++) {
                if (sieved_numbers[i] % p == 0) {
                    sieved_numbers[i] = 0;
                }
            }

            // Find next value of p
            boolean found = false;
            for (int i = 0; i < sieved_numbers.length && !found; i++) {
                if (sieved_numbers[i] > p) {
                    p = sieved_numbers[i];
                    found = true;
                }
            }
            if (!found) {
                p = n + 1;
            }
        }

        System.out.print("\n");
    }

}
