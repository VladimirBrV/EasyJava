package HomeWork.Homework4.Advance.Task2;

public class Market implements Have {
private Employee [] employees;

    public Market(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public void have() {

    }

    public Employee[] getEmployees() {
        return employees;
    }
}
