package Loop;

public class Fibonacci {
    static void printFibonacci(int N) {
        int firstNumber = 0, secondNumber = 1;

        System.out.print("Fibonacci up to " + N + " terms: ");

        for (int i = 0; i < N; i++) {
            System.out.print(firstNumber + " ");

            int lastNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = lastNumber;
        }
    }


    public static void main(String[] args) {
        printFibonacci(20);
    }
}
