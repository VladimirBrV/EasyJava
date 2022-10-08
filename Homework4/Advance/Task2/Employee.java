package HomeWork.Homework4.Advance.Task2;

public class Employee implements Have {

   private Watch watches;

    public Employee(Watch watches) {
        this.watches = watches;
    }
    
    @Override
    public void have() {

    }

    public Watch getWatches() {
        return watches;
    }
}
