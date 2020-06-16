package calendar;

public class YearsCalendal {

	public static boolean Leapyears(int years) {
		if(years%4 ==0 || (years%100 ==0 && years%400 == 0))
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt prom = new Prompt();
		prom.repeatprint();
	}

}






