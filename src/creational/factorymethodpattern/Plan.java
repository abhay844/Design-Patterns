package creational.factorymethodpattern;

public abstract class Plan {

    double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println("Total bill " + units * rate);
    }

}
