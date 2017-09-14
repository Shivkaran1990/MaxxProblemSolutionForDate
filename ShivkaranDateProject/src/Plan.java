import java.util.Date;


public class Plan {
	private Date endDate;
	private int id;
	private Date startDate;
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public int getId() {
		return id;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setId(int id) {
		this.id = id;
	}


}
