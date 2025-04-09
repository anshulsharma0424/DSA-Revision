package Recursion;

public class Q01_BasicRecursionProblems {

    public static void printName(int n){
        if (n == 0) return; // Base case
        System.out.print("*" + " "); // Working
        printName(n-1); // Function call with some parameter changes
    }

    public static void printNumbers(int n){
        if (n == 0) return;
        printNumbers(n-1);
        System.out.print(n + " ");
    }
    public static void printNumbersReverse(int n){
        if (n == 0) return;
        System.out.print(n + " ");
        printNumbers(n-1);
    }

    public static int sumOfFirstNNumbers(int n){
        if (n == 0) return 0;
        return n + sumOfFirstNNumbers(n-1);
    }

    public static void main(String[] args) {
        printName(5);
        System.out.println();

        printNumbers(5);
        System.out.println();

        printNumbersReverse(5);
        System.out.println();

        System.out.println(sumOfFirstNNumbers(5));
    }
}
