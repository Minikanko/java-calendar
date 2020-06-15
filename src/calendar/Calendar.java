package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxdayOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void printcal(int selectmonth) {
		System.out.println("  일   월   화   수   목   금   토");
		System.out.println("----------------------");
		int max = MAX_DAYS[selectmonth-1];
		for(int i=1; i<=max; i++) {
			System.out.printf("%3d",i);
			if(i%7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

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

	}

}

