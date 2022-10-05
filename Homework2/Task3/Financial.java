package HomeWork.Homework2.Task3;

public class Financial {

    int incomes ;
    int outcomes;

    public Financial (int incomes, int outcomes) {
        this.incomes =incomes;
        this.outcomes=outcomes;
    }
    public void setIncomes (int incomes) {
        this.incomes=incomes;

    }
    public int getIncomes () {
        return  incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
}
