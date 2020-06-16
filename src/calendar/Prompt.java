package calendar;

import java.util.Scanner;

public class Prompt {
	private static final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_DAYS= {31,29,31,30,31,30,31,31,30,31,30,31};

	
	public static void repeatprint(){
		Scanner scan = new Scanner(System.in);	
		while(true) {
			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			int year = scan.nextInt();
			if (year == -1) {
				System.out.print("Good Bye~ ");
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			int month = scan.nextInt();
			if (month == -1) {
				System.out.print("Good Bye~ ");
				break;
				
			}
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			String weekday = scan.next();
			
			if(month > 12 || month < 1){
				continue;
			}
			System.out.printf("\t<<%d년 %3d월>>\n",year,month);
			System.out.println("  SU  MO  TU  WE  TH  FR  SA");
			System.out.println("----------------------");
			printcal(year, month, weekday);
		}
		
	}
	//띄어쓰기 계산 메소드
	public static int spacecal(String weekday) {

		int weekspace = 0;
		if(weekday.equalsIgnoreCase("mo")) weekspace = 1;
		else if(weekday.equalsIgnoreCase("tu")) weekspace = 2;
		else if(weekday.equalsIgnoreCase("we")) weekspace = 3;
		else if(weekday.equalsIgnoreCase("th")) weekspace = 4;
		else if(weekday.equalsIgnoreCase("fr")) weekspace = 5; 
		else if(weekday.equalsIgnoreCase("sa")) weekspace = 6;
		else if(weekday.equalsIgnoreCase("su")) weekspace = 0;
		else weekspace=0;
		return weekspace;
	}
	
	public static void printcal(int years,int month,String weekday) {
		int maxdays = 0 ;
		int weekspace = spacecal(weekday);
		int count = 7-weekspace;
		
		//윤년 확인
		if(YearsCalendal.Leapyears(years)&& month==2) {
			maxdays = LEAP_DAYS[month-1];
		}
		else
			maxdays = MAX_DAYS[month-1];
		
		//빈칸 출력
		for(int i=0; i<weekspace; i++) {
			System.out.printf("    ");
		}
		
		
		for(int i=1;i<=count;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		for(int j=count+1;j<=maxdays;j++) {
			System.out.printf("%4d",j);
			if(j % 7 == count) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
