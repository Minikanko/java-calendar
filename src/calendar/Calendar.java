package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxdayOfMonth(int month) {
		return MAX_DAYS[month-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요:");
		int times = scanner.nextInt();
		int[] month = new int[times];
		System.out.println("월을 입력하세요:");
		for(int i = 1; i<=times; i++) {
			month[i-1] = scanner.nextInt();
		}
		for(int i = 1; i<=times; i++) {
			System.out.println(cal.getMaxdayOfMonth(month[i-1]));
		}
		
		
		
		scanner.close();
	}

}

