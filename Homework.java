package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static String isOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static Boolean isDivisible(int num1, int num2) {
        if (num2 == 0) {
            return false;
        } else return num1 % num2 == 0;
    }

    public static String concatNumbers(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            int number = num * i;
            result.append((number));
        }
        return result.toString();
    }

    public static int reverseDigit(int num) {
        if (num <= 9) {
            return num;
        } else {
            double lastDigit = num % 10;
            if (lastDigit == 0) {
                return num;
            } else {
                int quotient = (int) (num / 10);
                int length = String.valueOf(quotient).length();
                return (int) (lastDigit * Math.pow(10, length)) + quotient;
            }
        }
    }

    public static double avgNumbers(double num1, double num2, double num3, double num4, double num5) {
        double sum = num1 + num2 + num3 + num4 + num5;
        return sum / 5;
    }

    public static int[] ascOrder(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static String signValue(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                return "0";
            }
            if (numbers[i] < 0) {
                count++;
            }

        }
        if (count % 2 == 0) {
            return "+";
        } else return "-";

    }

    public static String quadraticEquation(int a, int b, int c) {
        if (a != 0 && b != 0 && c != 0) {
            double delta = (Math.pow(b, 2) - (4 * a * c));
            if (delta < 0) {
                return "Solution does not exist!";
            } else if (delta == 0) {
                double x = (-b) / (2 * a);
                return "Solution is " + Double.toString(x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                return "Solutions are " + Double.toString(x1) + " and " + Double.toString(x2);
            }
        } else {
            return "Input Valid Constants!";
        }

    }

    public static void changeFunction() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int i = 0;
        int j = 0;
        if (number % 2 == 0 && (Math.floor(number / 10)) != 0) {
            i += 1;
        }
        if (number % 3 == 0 && (Math.floor(number / 10)) != 0) {
            j += 1;
        }
        System.out.println("I is " + i + " and J is " + j);
    }

    public static boolean containsDigit(int digit, int number) {
        boolean result = false;

        while (number > 0) {
            int remainder = number % 10;
            if (remainder == digit) {
                result = true;
                break;
            }
            number -= remainder;
            number /= 10;
        }
        return result;
    }

    public static int reverseNumber(int number) {
        int tempNumber = number;
        int length = 0;
        int newNumber = 0;
        while (tempNumber > 0) {
            int remainder = tempNumber % 10;
            tempNumber -= remainder;
            tempNumber /= 10;
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            int remainder = number % 10;
            int power = (int) Math.pow(10, (i));
            newNumber += remainder * power;
            number -= remainder;
            number /= 10;
        }
        return newNumber;
    }

    public static double area() {
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        double base = input.nextDouble();
        double area = 0;
        String shape = input.next();
        if (height > 0 && base > 0) {
            if (shape.equalsIgnoreCase("rectangle")) {
                area = base * height;
            } else if (shape.equalsIgnoreCase("triangle")) {
                area = (base * height) / 2;
            } else {
                System.out.println("Unknown shape");
            }
        } else {
            System.out.println("Base and Height must be positive");
        }
        return area;

    }

    public static double difference(int number) {
        String str = (Integer.valueOf(number)).toString();
        char[] charArray = str.toCharArray();
        int[] array = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            array[i] = Character.getNumericValue(charArray[i]);
        }
        int length = array.length;
        if (length <= 1) {
            return 0;
        } else {
            double min = array[0];
            double max = array[0];
            for (int i = 0; i < length; i++) {
                if (array[i] >= max) {
                    max = array[i];
                }
                if (array[i] <= min) {
                    min = array[i];
                }
            }
            return max - min;
        }
    }


    public static void main(String[] args) {

//        SOME CALLS TO THE FUNCTIONS FOR CHECKS

//        System.out.println(concatNumbers(3));
//        System.out.println(reverseDigit(6578595));
//        System.out.println(Arrays.toString(ascOrder(5, 6, 4)));
//        System.out.println(signValue(0, -2, 3));
//        System.out.println(quadraticEquation(-2, -2, 3));
//        changeFunction();
//        boolean contains = containsDigit(4, 123455);
//        System.out.println(contains);
//        int number = reverseNumber(34567);
//        System.out.println(number);
//        System.out.println(area());
//        System.out.println(difference(3));
    }

}
