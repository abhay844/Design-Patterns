package creational.abstractfactory.pattern;

/**
 * This class is going to be factory of factories
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory abstractFactory) {
        return abstractFactory.createComputer();
    }
}
