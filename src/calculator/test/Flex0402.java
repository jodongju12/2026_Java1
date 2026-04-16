package calculator.test;

public class Flex0402 {
    public static void main(String[] args) {
        int total = 0;

        total -= 900 * 10; //total = total - 900 * 10;
        total += 1800 * 2; //total = total + 1800 * 2;
        total -= 3500 * 5; //total = total - 3500 * 5;
        total += 4000 * 4; //total = total + 4000 * 4;
        total += 1500; //total = total + 1500;
        total += 200 * 4; //total = total + 200 * 4;
        total += 1800 * 5; //total = total + 1800 * 5;

        System.out.println("편의점 총매출액: " + total + "원");
    }
}