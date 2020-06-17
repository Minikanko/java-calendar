package calendar;

public class YearsCalendal {
	private static final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_DAYS= {31,29,31,30,31,30,31,31,30,31,30,31};

	public static boolean Leapyears(int years) {
		if(years%4 ==0 || (years%100 ==0 && years%400 == 0))
			return true;
		else
			return false;
		
	}
//윤년 확인
	public static int Is_Leapyear(int years,int month) {
		int maxdays = 0;
		if(Leapyears(years)) {
			return maxdays = LEAP_DAYS[month-1];
		}
		else
			return maxdays = MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt.prompt();
	}

}






