package ai0514;

public class GuGuDan03 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%d\t", j, i, i * j);
            }
            System.out.println();
        }

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%d\n", j, i, i * j);
            }
        }
    }
}