package HomeWork.Homework4.Advance.Task1;

public class Fir extends Tree {
    public Fir(boolean cone) {
        super(cone);
    }

    @Override
    public void smell() {
        System.out.println("Ель :умеет пахнуть");
    }
}
