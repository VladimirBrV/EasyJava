package HomeWork.Homework4.Easy;

public class Duck implements  Flyable {
    boolean isInjured;
    public Duck (boolean isInjured) {
        this.isInjured=isInjured;
    }
    public void fly  () {
        if (isInjured == true) {
            System.out.println("Я лечу");
        } else if (isInjured == false) {
            try {
                FlyException.callExeptions();
            } catch (Exception exception) {
                System.out.println("Ошибка: Утка не может лететь так как подбито крыло");}
            }

        }
    }
