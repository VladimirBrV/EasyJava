package HomeWork.Homework4.Advance.Task1;

public class MainHW4 {

    public static void main(String[] args) {
        Pine pine = new Pine(true);
        Fir fir = new Fir(true);
        Rose rose = new Rose();
        Fern fern = new Fern();

        Smelling [] smellings =  {pine,fir,rose};
        for (Smelling element : smellings){
            element.smell();
        }
        Blooming[] bloomings = {fern,rose};
        for (Blooming element : bloomings) {
            element.bloom();
        }
    }
}
