package recursion;

public class Recursion {
    public int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return factorial(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(500));
    }
}
