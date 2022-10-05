package HomeWork.Homework2.Task4;

import HomeWork.Homework2.Task1.Cars;
import HomeWork.Homework2.Task1.Giguli;
import HomeWork.Homework2.Task1.Toyota;

public class MaintTask4 {
    public static void main(String[] args) {

        Cars[] cars = new Cars[40];
        for (int i = 0; i < 20; i++) {
            cars[i] = CarFactory.creatGiguli();
            cars[i + 20] = CarFactory.creatToyta();
        }

            for (Cars car : cars) {
                if (car instanceof Giguli) {
                    Giguli giguli = (Giguli) car;
                    giguli.breakCar();
                } else if (car instanceof Toyota) {
                    Toyota toyota = (Toyota) car;
                    toyota.onMusic();
                }
            }
        }
    }
