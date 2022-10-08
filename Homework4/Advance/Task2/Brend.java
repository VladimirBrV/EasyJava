package HomeWork.Homework4.Advance.Task2;

public class Brend implements Have {

   private Market [] markets;

    public Brend(Market[] markets) {
        this.markets = markets;
    }

    @Override
    public void have() {

    }

    public Market[] getMarkets() {
        return markets;
    }
}
