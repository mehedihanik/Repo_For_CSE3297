public class PrimeNumberProgram {
    static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {
            isItPrime = false;

            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }
}
