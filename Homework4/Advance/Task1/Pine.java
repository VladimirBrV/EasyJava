package HomeWork.Homework4.Advance.Task1;

public class Pine extends Tree implements Smelling  {

    public Pine(boolean cone) {
        super(cone);
    }

    @Override
    public void smell() {
                System.out.println("Сосна: Умеет пахнуть");
    }
}
