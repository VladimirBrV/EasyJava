package HomeWork.Homework4.Easy;

public class Airplane implements Flyable {
    int countPassagers;
    public Airplane (int countPassagers) {
        this.countPassagers=countPassagers;
    }
    public void fly () throws  FlyException {
        if (countPassagers<0) {throw new  FlyException (" Ошибка : В самолете нет пассажиров");}
           else System.out.println("Самолет улетел ");
            }
        }
