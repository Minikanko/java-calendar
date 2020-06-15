package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요:");
		int i = scanner.nextInt();
		
		
		if(i==1 || i ==3 || i==5 || i==7 || i==8 ||i==10 ||i==12) {
			System.out.printf("%d월은 31일까지 있습니다.\n", i);
		}
		else if(i==2) {
			System.out.printf("%d월은 28일까지 있습니다.\n", i);
		}
		else
			System.out.printf("%d월은 30일까지 있습니다.\n", i);

		
		scanner.close();
	}

}

