package ai0611;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SchoolBus schoolBus = new SchoolBus();
        SportsCar sportsCar = new SportsCar();

        while (true) {
            System.out.print("가속할 속도 ==> ");
            int inputSpeed = sc.nextInt();

            if (inputSpeed == -1) { // 무한반복을 종료하기 위한 방법
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            schoolBus.upSpeed(inputSpeed);
            sportsCar.upSpeed(inputSpeed);

            System.out.println("** 스쿨버스의 현재 속도: " + schoolBus.getSpeed());
            System.out.println("** 스포츠카의 현재 속도: " + sportsCar.getSpeed());
            System.out.println();
        }

        sc.close();
    }
}


