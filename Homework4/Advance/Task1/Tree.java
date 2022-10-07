package HomeWork.Homework4.Advance.Task1;

public class Tree implements Smelling {

    boolean cone ;

    public Tree(boolean cone) {
        this.cone = true;
    }

    public void smell () {
        System.out.println("Умеют пахнуть");
    }
}
