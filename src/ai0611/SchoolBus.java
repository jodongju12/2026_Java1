package ai0611;

public class SchoolBus extends Car {

    @Override
    public void upSpeed(int speed) {
        this.speed += speed;

        if (this.speed > 60) {
            this.speed = 60;
        }
    }
}
