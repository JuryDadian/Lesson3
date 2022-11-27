package group3;

public class Class3_1_Fibonacci {
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        System.out.print(n0 + " ");
        System.out.print(n1 + " ");
        for (int i = 2; i < 11; i++) {
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.print(n2 + " ");
        }
    }
}
