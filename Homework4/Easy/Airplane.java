package HomeWork.Homework4.Easy;

public class Airplane implements Flyable {

    int countPassagers;

    public Airplane (int countPassagers) {
        this.countPassagers=countPassagers;
    }

    public void fly ()  {
        if (countPassagers>0) {System.out.println("Я лечу");}
        else if (countPassagers<0) {
            try {
                FlyException.callExeptions();
            } catch (Exception exception) {
                System.out.println("Ошибка: Самолет не летит нет пассажиров");
            }


        }
    }
}
