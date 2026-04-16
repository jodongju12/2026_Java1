package calculator.test;

import java.util.Scanner;

public class pound0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🥋 주짓수 체급 환산기 (Lenn Style) ===");
        System.out.println("1. 파운드(lb) -> 킬로그램(kg)");
        System.out.println("2. 킬로그램(kg) -> 파운드(lb)");
        System.out.print("어떤 걸 변환할까요? (1 또는 2 선택): ");

        int choice = sc.nextInt();

        if (choice == 1) {
            // lb -> kg 변환
            System.out.print("변환할 파운드(lb)를 입력하세요: ");
            double lb = sc.nextDouble();
            double kg = lb * 0.453592;
            System.out.printf("결과: %.2f lb는 약 %.2f kg 입니다.\n", lb, kg);

        } else if (choice == 2) {
            // kg -> lb 변환
            System.out.print("변환할 킬로그램(kg)을 입력하세요: ");
            double kg = sc.nextDouble();
            double lb = kg * 2.204623;
            System.out.printf("결과: %.2f kg는 약 %.2f lb 입니다.\n", kg, lb);

        } else {
            System.out.println("잘못된 번호입니다. 1번이나 2번을 골라주세요!");
        }

        System.out.println("==========================================");
        System.out.println("수지(죽전)로 퇴근하기까지 화이팅입니다!");

        sc.close();
    }
}
