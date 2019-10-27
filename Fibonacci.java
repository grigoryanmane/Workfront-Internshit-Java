
public class Fibonacci {
    public static int fib(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }

    public static void printFibonacci(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(fib(i));
        }
    }

    public static void main(String[] args) {
        //The problem could have been solved in a better way by using arrays and storing
        //the fib values in them for the later use, however, it was mentioned in the instructions
        //to use recursion for the problem
        printFibonacci(7);
    }
}
