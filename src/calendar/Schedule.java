package calendar;

public class Schedule {
	private String days;
	private String context;
	
	
	Schedule(String days, String context){
		this.days=days;
		this.context=context;
		
	}
	public String getdays() {
		return days;
	}
	public String getcontext() {
		return context;
	}

}
