import java.util.Comparator;


public class IdComparator implements Comparator<Plan> {

	@Override
	public int compare(Plan o1, Plan o2) {
		if(o1.getId()>=o2.getId())
		{
			return 1;
		}
		return -1;
	}

}
