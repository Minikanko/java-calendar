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
			System.out.println(cal.getMaxdayOfMonth(input));
			
		}
		
		
//		for(int i = 1; i<=times; i++) {
//			month[i-1] = scanner.nextInt();
//		}
//		for(int i = 1; i<=times; i++) {
//			System.out.println(cal.getMaxdayOfMonth(month[i-1]));
//		}

	}

}

