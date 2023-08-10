package creational.factorymethod.pattern;

public class PlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        } else if (planType.equalsIgnoreCase("DomesticPlan")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("CommercialPlan")) {
            return new CommercialPlan();
        }
        return null;
    }
}
