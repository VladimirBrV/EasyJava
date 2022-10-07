package HomeWork.Homework4.Advance.Task2;

public class Watch  {

    boolean stateOfClockWorks;

    public Watch(boolean stateOfClockWorks) {
        this.stateOfClockWorks = stateOfClockWorks;
    }

    public void Tik() {
        if (stateOfClockWorks == true) {
            System.out.println("Часы тикают");
        } else if (stateOfClockWorks == false) {
            try {
                WatchBrokenError.callExtetions();
            } catch (Exception exception) {
                System.out.println("Ошибка : Часы сломаны");
            }


        }
    }
}

