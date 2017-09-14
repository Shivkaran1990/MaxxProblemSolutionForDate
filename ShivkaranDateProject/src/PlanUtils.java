import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PlanUtils {
	
	public static Map<Integer,Plan> getOldPlan() {
		
		Map<Integer,Plan> oldPlanMap=new HashMap();
		
		Plan p=new Plan();
		p.setId(101);
		p.setStartDate(convertStringtoDate("10-May-2016"));
		p.setEndDate(convertStringtoDate("20-May-2016"));
		
		Plan p1=new Plan();
		p1.setId(102);
		p1.setStartDate(convertStringtoDate("10-May-2016"));
		p1.setEndDate(convertStringtoDate("20-May-2016"));
		

		Plan p2=new Plan();
		p2.setId(103);
		p2.setStartDate(convertStringtoDate("10-May-2016"));
		p2.setEndDate(convertStringtoDate("20-May-2016"));
		
		Plan p3=new Plan();
		p3.setId(104);
		p3.setStartDate(convertStringtoDate("10-May-2016"));
		p3.setEndDate(convertStringtoDate("20-May-2016"));
		
		Plan p4=new Plan();
		p4.setId(105);
		p4.setStartDate(convertStringtoDate("10-May-2016"));
		p4.setEndDate(convertStringtoDate("20-May-2016"));
		
		Plan p5=new Plan();
		p5.setId(106);
		p5.setStartDate(convertStringtoDate("10-May-2016"));
		p5.setEndDate(convertStringtoDate("20-May-2016"));
		
		Plan p6=new Plan();
		p6.setId(107);
		p6.setStartDate(convertStringtoDate("10-May-2016"));
		p6.setEndDate(convertStringtoDate("20-May-2016"));
		
		oldPlanMap.put(101, p);
		oldPlanMap.put(102, p1);
	    oldPlanMap.put(103, p2);
		oldPlanMap.put(104, p3);
		oldPlanMap.put(105, p4);
	    oldPlanMap.put(106, p5);
		return oldPlanMap;
	}

	
	public static List<Plan> getNewPlanList() {

		List<Plan> newPlanList=new ArrayList();		
		Plan p=new Plan();
		p.setId(101);
		p.setStartDate(convertStringtoDate("01-May-2016"));
		p.setEndDate(convertStringtoDate("05-May-2016"));
		
		Plan p1=new Plan();
		p1.setId(104);
		p1.setStartDate(convertStringtoDate("15-May-2016"));
		p1.setEndDate(convertStringtoDate("18-May-2016"));
		
		Plan p2=new Plan();
		p2.setId(103);
		p2.setStartDate(convertStringtoDate("05-May-2016"));
		p2.setEndDate(convertStringtoDate("25-May-2016"));
		
		
		Plan p3=new Plan();
		p3.setId(105);
		p3.setStartDate(convertStringtoDate("15-May-2016"));
		p3.setEndDate(convertStringtoDate("25-May-2016"));
		
		
		Plan p4=new Plan();
		p4.setId(102);
		p4.setStartDate(convertStringtoDate("05-May-2016"));
		p4.setEndDate(convertStringtoDate("15-May-2016"));
		
		
		Plan p5=new Plan();
		p5.setId(106);
		p5.setStartDate(convertStringtoDate("25-May-2016"));
		p5.setEndDate(convertStringtoDate("30-May-2016"));
		
		newPlanList.add(p);
		newPlanList.add(p1);
		newPlanList.add(p2);
		newPlanList.add(p3);
		newPlanList.add(p4);
		newPlanList.add(p5);
		
		return newPlanList;
	}
	
	public static Date convertStringtoDate(String str)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date date=null;
		try {
             date = formatter.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		return date;
	}
	
}
