package calculator.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ai0402 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("============= Simple Calculator ================");

        System.out.print("정수1 입력 ===> ");
        int num1 = s.nextInt();
        System.out.print("정수2 입력 ===> ");
        int num2 = s.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d × %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d ÷ %d = %.2f\n", num1, num2, (double)num1/num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

        s.close();
    }
}
