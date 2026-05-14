package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class CafeKiosk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Menu> menuList = new ArrayList<>();

        menuList.add(new Menu("아메리카노", 3000));
        menuList.add(new Menu("라떼", 4000));
        menuList.add(new Menu("모카", 4500));
        menuList.add(new Menu("케이크", 5000));

        int totalPrice = 0;
        boolean running = true;

        System.out.println("=================================");
        System.out.println("        자바 카페 키오스크");
        System.out.println("=================================");

        while (running) {

            System.out.println("\n메뉴");
            System.out.println("---------------------------------");

            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". "
                        + menuList.get(i).name
                        + " - "
                        + menuList.get(i).price
                        + "원");
            }

            System.out.println("5. 결제하기");
            System.out.println("0. 종료");

            System.out.print("\n메뉴 선택: ");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("숫자만 입력해주세요.");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                case 2:
                case 3:
                case 4:

                    Menu selectedMenu = menuList.get(choice - 1);

                    totalPrice += selectedMenu.price;

                    System.out.println(selectedMenu.name + " 선택됨.");
                    System.out.println("현재 총 금액: " + totalPrice + "원");

                    break;

                case 5:

                    System.out.println("\n========== 영수증 ==========");
                    System.out.println("총 금액 : " + totalPrice + "원");
                    System.out.println("이용해주셔서 감사합니다!");
                    System.out.println("===========================");

                    totalPrice = 0;

                    break;

                case 0:

                    running = false;
                    System.out.println("프로그램 종료.");

                    break;

                default:

                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        }

        sc.close();
    }
}
