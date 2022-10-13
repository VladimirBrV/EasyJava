package HomeWork.Modul2.Homework2;

public class User {
    private int number;

    public void User (int number) {
        this.number=number;
    }
    public void setNumber (int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", number);
    }
}
