package calendar;

import java.util.Scanner;

public class Confirmcal {
	static YearsCalendal cal = new YearsCalendal();
	public void repeatprint(){
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

			else if(month > 12 || month < 1){
				continue;
			}
			System.out.printf("\t<<%3d년 %3d월>>\n",year,month);
			System.out.println("  SU  MO  TU  WE  TH  FR  SA");
			System.out.println("----------------------------");
			printcal(year, month);
			break;
		}
		
	}

	public static int DayOfWeek(int years,int month) {
		int pointyear = 1970;
		int pointmonth = 1;
		int pointday = 4;
		int totaldays = 0;
		
		for(int i = pointyear; i<years; i++) { //1970년 이전 달력은 셀수없다는 가정함
			if(cal.Leapyears(i)) {
				totaldays +=366;
			}
			else {
				totaldays +=365;
			}
		}
		
		for(int i = pointmonth; i<month; i++) {
			totaldays += cal.Is_Leapyear(years,i);
			
		}
		return (totaldays+pointday)%7;
	}
	
	public static void printcal(int years,int month) {
		
		int maxdays = cal.Is_Leapyear(years,month);
		int weekspace = DayOfWeek(years,month);
		int count = 7-weekspace;
		
		
		
		
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
