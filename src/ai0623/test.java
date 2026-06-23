package ai0623;

import java.util.ArrayList;
import java.util.Scanner;

// 1. 부모 클래스 (추상 클래스)
abstract class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

    public abstract void printDetails();
}

// 2. 자식 클래스 1 (음료)
class Drink extends MenuItem {
    private boolean isIced;

    public Drink(String name, int price, boolean isIced) {
        super(name, price);
        this.isIced = isIced;
    }

    @Override
    public void printDetails() {
        String temp = isIced ? "ICE" : "HOT";
        System.out.println("- [" + temp + " 음료] " + getName() + " : " + getPrice() + "원");
    }
}

// 3. 자식 클래스 2 (디저트)
class Dessert extends MenuItem {
    private int calories;

    public Dessert(String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
    public void printDetails() {
        System.out.println("- [디저트] " + getName() + " (" + calories + "kcal) : " + getPrice() + "원");
    }
}

// 4. 메인 실행 클래스
class KioskMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 다형성을 활용한 장바구니 리스트 (부모 타입으로 관리)
        ArrayList<MenuItem> cart = new ArrayList<>();
        int totalPrice = 0;

        System.out.println("=== ☕ OOP 카페 키오스크 ===");

        while (true) {
            System.out.println("\n1. 아메리카노(ICE) 추가");
            System.out.println("2. 카페라떼(HOT) 추가");
            System.out.println("3. 치즈케이크 추가");
            System.out.println("4. 주문 완료 및 결제");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                cart.add(new Drink("아메리카노", 3000, true));
                System.out.println(">> 아메리카노(ICE)가 장바구니에 담겼습니다.");
            } else if (choice == 2) {
                cart.add(new Drink("카페라떼", 3500, false));
                System.out.println(">> 카페라떼(HOT)가 장바구니에 담겼습니다.");
            } else if (choice == 3) {
                cart.add(new Dessert("치즈케이크", 5500, 350));
                System.out.println(">> 치즈케이크가 장바구니에 담겼습니다.");
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        System.out.println("\n============= [주문 영수증] =============");
        // 다형성을 통한 출력 처리
        for (MenuItem item : cart) {
            item.printDetails(); // 각각 오버라이딩 된 메서드가 실행됨
            totalPrice += item.getPrice();
        }
        System.out.println("-----------------------------------------");
        System.out.println("총 결제 금액: " + totalPrice + "원");
        System.out.println("=========================================");

        scanner.close();
    }
}
