package calculator.test;

import java.util.Scanner;

public class F10402 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("===== F1 합격여부 확인 ======");
        System.out.println("필기시험 점수 입력:");
        int score = s.nextInt();
        String result = "";//empty String

        if(score >= 70)
            result = "합격";
        else
            result = "불합격";

        System.out.printf("%d점이므로 %s입니다.", score, result);

        s.close();
    }
}
