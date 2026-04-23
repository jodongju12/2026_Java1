package ai0423;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);//문자열 입력용
        System.out.println("=============== BMI(Body Index Mass) ===============\n");

        System.out.print("* 체중(㎏, 실수값) 입력:");
        double weight = s.nextDouble();

        System.out.print("* 키(㎝, 실수값) 입력:");
        double height = s.nextDouble();

        System.out.print("* 성명 입력:");
        String name = s1.nextLine();

        double bmi = weight / Math.pow(height/100, 2); //((height/100)*(height/100))
        String result1, result2;

        if (bmi < 18.5) {
            result1 = "저";
            result2 = "식단과 운동을 통해 체중을 증량시켜야 합니다. 생명에 위협이 있을 수도 있습니다.";
        }else if (bmi < 22.9) {
            result1 = "정상";
            result2 = "현재 체중을 유지하시기 바랍니다.";
        }else if (bmi < 24.9) {
            result1 = "과";
            result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다.";
        }else if (bmi < 29.9) {
            result1 = "비만";
            result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다. 성인병 유발에 원인이 될 수 있습니다.";
        }else {
            result1 = "고도비만";
            result2 = "전문가의 도움을 통해 식단과 운동을 통해 체중을 감량하시기 바랍니다. 성인병 유발에 원인이 될 수 있습니다.";
        }



        System.out.printf("* %s님의 BMI 지수 결과: %.2f㎏/㎡이므로 %s체중입니다.\n", name, bmi, result1);
        System.out.printf("* %s체중은 %s, result1, result2");

        s.close();
        s1.close();
    }
}

