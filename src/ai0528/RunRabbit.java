package ai0528;


public class RunRabbit {
    public static void main(String[] args) {
        RunRabbit rabbit = new rabbit();



//        rabbit.setShape("동그라미");
        rabbit.shape = "삼각형";
        rabbit.printInfo();
//        rabbit.setLacation(50, 80);
        rabbit.x = 70;
        rabbit.y = 100;
        rabbit.printInfo();
    }
}
