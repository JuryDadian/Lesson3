package group3;

public class Class3_3_table {
    public static int [][] table = new int[10][10];
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                table[i-1][j-1] = i * j;
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

