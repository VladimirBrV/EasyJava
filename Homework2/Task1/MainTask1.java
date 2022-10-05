package HomeWork.Homework2.Task1;

public class MainTask1 {
    public static void main(String[] args) {

        Giguli giguli = new Giguli();
        Toyota toyota = new Toyota();

        giguli.drive();
        giguli.onTurnLight();
        giguli.stop();
        giguli.breakCar();

        toyota.drive();
        toyota.stop();
        toyota.onTurnLight();
        toyota.onMusic();
    }


}
