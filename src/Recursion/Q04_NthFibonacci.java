package Recursion;

public class Q04_NthFibonacci {
    public static int nthFib(int n) {
        if (n <= 1) return n;
        return nthFib(n - 1) + nthFib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(nthFib(4));
    }
}
