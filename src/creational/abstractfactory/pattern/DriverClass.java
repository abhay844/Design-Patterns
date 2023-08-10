package creational.abstractfactory.pattern;

public class DriverClass {

    public static void main(String[] args) {
        Computer serverComputer = ComputerFactory.getComputer(new ServerFactory("1", "2", "3"));
        System.out.println("Configurations of Server computer: " + serverComputer.toString());

        Computer pcComputer = new PCFactory("3", "2", "1").createComputer();
        System.out.println("Configurations of PC computer: " + pcComputer.toString());
    }
}
