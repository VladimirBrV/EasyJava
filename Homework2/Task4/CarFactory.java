package HomeWork.Homework2.Task4;

import HomeWork.Homework2.Task1.Cars;
import HomeWork.Homework2.Task1.Giguli;
import HomeWork.Homework2.Task1.Toyota;

public class CarFactory extends Cars {

    public static Giguli creatGiguli () {
        return new Giguli();
    }
    public static Toyota creatToyta () {
        return new Toyota();
    }
}
