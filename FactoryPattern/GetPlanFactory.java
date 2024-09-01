public class GetPlanFactory {

    public Plan getPlan(String planType)
    {
        if(planType==null)
        {
            return null;
        }else if(planType.equalsIgnoreCase("DOM"))
        {
                 return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COM")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INS")) {

            return new InstituationPlan();
        }
        return null;
    }
}
