package HomeWork.Homework4.Advance.Task2;

public class MainHW4 {
    public static void main(String[] args) {

       Watch watch = new Watch(true);
       Watch watchBroken = new Watch(false);

       Employee  employee1 = new Employee(watch);
       Employee employee2 = new Employee(watchBroken);

       Employee[] employeeMarket1 = {employee1};
       Employee[] employeeMarket2 = {employee2};

       Market market1 = new Market(employeeMarket1);
       Market market2 = new Market(employeeMarket2);

       Market[] markets = {market2,market1};

       Brend brends = new Brend(markets);

       for (Market market : brends.getMarkets()) {
           for (Employee employee: market.getEmployees()){
               Watch workerWatch = employee.getWatches();
               try {
                   workerWatch.Tik();
               } catch (RuntimeException exception) {
                   System.out.println(" Ошибка : Часы не работают");
               }
           }
       }





    }
}
