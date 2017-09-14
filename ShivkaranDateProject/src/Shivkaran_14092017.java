import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class Shivkaran_14092017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Plan> oldPlan=PlanUtils.getOldPlan();
		List<Plan> newPlan=PlanUtils.getNewPlanList();
		List<Plan> cancelPlans=getCancelledPeriodsForTask(oldPlan, newPlan);
		Collections.sort(cancelPlans, new IdComparator());
		
		for(Plan p:cancelPlans)
		{
			System.out.println(p.getId()+"            "+p.getStartDate()+"            "+p.getEndDate());			
		}		
	}
	
	public static List<Plan> getCancelledPeriodsForTask(Map<Integer,Plan> oldPlan,List<Plan> newPlan)
	{
		
		List<Plan> cancelPlans=new ArrayList();
		Plan plan=null;
		
		
		for(Integer id:oldPlan.keySet())
		{
			Plan oldp=oldPlan.get(id);
			
			for(Plan newp:newPlan)
			{
				if(oldp.getId()==newp.getId())
				{
					Date oldPlanStartDate=oldp.getStartDate();
					Date newPlanStartDate=newp.getStartDate();
					Date oldPlanEndDate=oldp.getEndDate();
					Date newplanEndDate=newp.getEndDate();
					
					if(newPlanStartDate.before(oldPlanStartDate) && newplanEndDate.before(oldPlanStartDate) ||
							newPlanStartDate.after(oldPlanEndDate)	
							)
					{
					 cancelPlans.add(oldp);						
					 }else
					 {
						if(newPlanStartDate.after(oldPlanStartDate))// && oldPlanEndDate.after(newplanEndDate))
						{
							int n=newPlanStartDate.getDate();
							int o=oldPlanStartDate.getDate();
							int temp=n-o-1;
							Date newdate=addDays(temp,oldPlanStartDate);							
							plan=new Plan();
							plan.setId(newp.getId());
							plan.setStartDate(oldPlanStartDate);
							plan.setEndDate(newdate);
							cancelPlans.add(plan);							
						}
						if(newplanEndDate.before(oldPlanEndDate))
						{
							int n=newplanEndDate.getDate();
							int o=oldPlanEndDate.getDate();
							int temp=o-n-1;	
							Date newdate=subtractDays(temp,oldPlanEndDate);							
							plan=new Plan();
							plan.setId(newp.getId());
							plan.setStartDate(newdate);
							plan.setEndDate(oldPlanEndDate);
							cancelPlans.add(plan);		
						}
					 }	
				}
			}
		}
	    return cancelPlans;	
	}

	private static Date addDays(int temp, Date oldPlanStartDate) {
		 Calendar cal = Calendar.getInstance();
	        cal.setTime(oldPlanStartDate);
	        cal.add(Calendar.DATE, temp); //minus number would decrement the days
	        return cal.getTime();
	}

	private static Date subtractDays(int temp, Date oldPlanStartDate) {
		 Calendar cal = Calendar.getInstance();
	        cal.setTime(oldPlanStartDate);
	        cal.add(Calendar.DATE, -temp); //minus number would decrement the days
	        return cal.getTime();
	}

}
