package creational.factorymethodpattern;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        Scanner scanner = new Scanner(System.in);
        String plan = scanner.nextLine();
        Plan obj = planFactory.getPlan(plan);
        obj.getRate();
        obj.calculateBill(10);
    }
}
