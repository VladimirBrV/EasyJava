package HomeWork.Homework4.Easy;

public class Duck implements  Flyable {
    boolean isInjured;
    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }
    public void fly() throws FlyException {
        if (isInjured == true) {
            throw new FlyException ("Ошибка : Утка ранена летать не может ");
        } else {
            System.out.println("Утка улетела");
        }
    }
}