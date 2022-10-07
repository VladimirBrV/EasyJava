package HomeWork.Homework4.Easy;

public class MainHW4 {
    public static void main(String[] args) throws Exception {
Duck duck = new Duck(true);
Duck duck2 =new Duck(false);
Airplane airplane = new Airplane(10);
Airplane airplane1 = new Airplane(-1);
Flyable [] flyables = {duck,duck2,airplane,airplane1};
for (Flyable elements : flyables) {
    elements.fly();

}


    }
}
