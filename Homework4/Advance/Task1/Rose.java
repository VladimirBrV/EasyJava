package HomeWork.Homework4.Advance.Task1;

public class Rose extends  Flowers implements Smelling  {

    @Override
    public void smell() {
        System.out.println("Роза: Умеет пахнуть ");
    }

    @Override
    public void bloom() {
        System.out.println("Роза : Умеет цвести");
    }
}
