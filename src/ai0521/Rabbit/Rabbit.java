package ai0521.Rabbit;

public class Rabbit {
    String shape;  // 토끼의 모양
    int xPos;      // X 위치
    int yPos;      // Y 위치

    //   JVM은 클래스 내에 생성자가 하나도 없는 경우 기본생성자를 만들어서 사용한다.
//   그러나 클래스 내에 생성자가 선언 되어 있다면 선언된 생성자만 사용할 수 있다.
    public Rabbit() {

    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    // getter(필드값 반환), setter(필드값 설정)
    public String getShape() {
        return shape;
    }


    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    //    토끼의 좌표값을 설정하는 메소드 구현
    public void setLocation(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    //    토끼의 모양, 위치 출력 메소드
    public void printInfo() {
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고 있다.\n", shape, xPos, yPos);
    }

    //   x축으로 10씩 오른쪽으로 이동하는 메소드
    public void moveRightTen() {
        xPos += 10;
    }

    //   x축으로 10씩 왼쪽으로 이동하는 메소드
    public void moveLeftTen() {
        xPos -= 10;
    }
}