import java.util.Scanner;

public class BjjCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("계산기");
        System.out.println("숫자 넣어라");

        System.out.print("첫 번째 숫자 입력: ");
        double num1 = sc.nextDouble();

        System.out.print("연산자 선택 (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("두 번째 숫자 입력: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 != 0) result = num1 / num2;
                else {
                    System.out.println("에러: 0으로 나눌 수 없습니다");
                    return;
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.println("-------------------------");
        System.out.printf("결과: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
        System.out.println("시마이");
    }
}
