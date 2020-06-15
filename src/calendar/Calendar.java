package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxdayOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void printcal(int selectmonth) {
		if(MAX_DAYS[selectmonth-1] == 31) {
			System.out.println("일   월   화   수   목   금   토");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30 31");
		}
		else if(MAX_DAYS[selectmonth-1] == 30) {
			System.out.println("일   월   화   수   목   금   토");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30");

		}
		else {
			System.out.println("일   월   화   수   목   금   토");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");						
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		while(true) {
			System.out.println("월을 입력하세요:");
			System.out.print("> ");
			int input = scanner.nextInt();
			if(input <=0) {
				scanner.close();
				System.out.println("Have a nice day!");
				break;
			}
			else if (input > 12) {
				continue;
			}
			cal.printcal(input);
			
		}
		
		
//		for(int i = 1; i<=times; i++) {
//			month[i-1] = scanner.nextInt();
//		}
//		for(int i = 1; i<=times; i++) {
//			System.out.println(cal.getMaxdayOfMonth(month[i-1]));
//		}

	}

}

