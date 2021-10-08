package io.github.plizzzhealme.training;

public class Main {

    public static void main(String[] args) {

        // todo something
    }

    // task 1
    private static boolean isEqualSum(final int fourDigitNumber) {
        int min = 1000;
        int max = 9999;
        int digits12;
        int digits34;

        // return false if the number is not 4-digit
        if (min > fourDigitNumber || fourDigitNumber > max) {
            return false;
        }

        digits12 = fourDigitNumber / 100;
        digits34 = fourDigitNumber % 100;

        return digits12 / 10 + digits12 % 10 == digits34 / 10 + digits34 % 10;
    }

    // task 2
    private static double calcFormula(double a, double b, double c) {
        double x1 = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a);
        double x2 = a * a * a * c;
        double x3 = Math.pow(b, -2);
        return x1 - x2 + x3;
    }

    // task 3
    private static double calcPerimeter(double a, double b) {
        return a + b + Math.sqrt(a * a + b * b);
    }

    // task 3
    private static double calcArea(double a, double b) {
        return a * b / 2;
    }

    // task 4
    private static boolean checkPoint(int x, int y) {
        boolean isBottom = (-4 <= x) && (x <= 4) && (-3 <= y) && (y <= 0);
        boolean isTop = (-2 <= x) && (x <= 2) && (0 <= y) && (y <= 4);

        return isBottom || isTop;
    }

    // task 5
    private static double exponent(double a) {
        if (a < 0) {
            return Math.pow(a, 4);
        }

        return Math.pow(a, 2);
    }

    // task 6
    private static double maxMinSum(double a, double b, double c) {
        double max;
        double min;

        max = Math.max(a, b);
        max = Math.max(max, c);

        min = Math.min(a, b);
        min = Math.min(min, c);

        return max + min;
    }

    // task 7
    private static double f(double x) {
        return Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
    }

    // task 7
    private static void printFunction(double a, double b, double h) {
        double x = a;
        double y;

        for (int i = 1; x <= b; i++) {
            y = f(x);

            System.out.printf("f(%.2f) = %.2f%n", x, y);

            x = a + i * h;
        }
    }

    // task 8
    private static int calcMultiplesSum(int[] arr, int k) {
        int sum = 0;

        for (int value : arr) {
            if (value % k == 0) {
                sum += value;
            }
        }

        return sum;
    }

    // task 9
    private static int[] merge(int[] arr1, int[] arr2, int index) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length = length1 + length2;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            if (i <= index) {
                arr[i] = arr1[i];
            } else if (i <= index + length2) {
                arr[i] = arr2[i - index - 1];
            } else {
                arr[i] = arr1[i - length2];
            }
        }
        return arr;
    }

    // task 10
    private static int[][] buildMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int row = 1; row < size; row += 2) {
            for (int col = 0; col < size; col++) {
                matrix[row - 1][col] = col + 1;
                matrix[row][col] = size - col;
            }
        }
        return matrix;
    }
}
