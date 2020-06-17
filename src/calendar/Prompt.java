package calendar;

import java.util.Scanner;

public class Prompt {
	static Confirmcal cal = new Confirmcal();
	static Function func = new Function();
	
	public static void prompt() {
		Scanner scan = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.println("+----------------------+");
			System.out.println("| 1. 일정 등록");
			System.out.println("| 2. 일정 검색");
			System.out.println("| 3. 달력 보기");
			System.out.println("| h. 도움말 q. 종료");
			System.out.println("+----------------------+");
			
			input = scan.next();
			
			if(input.equalsIgnoreCase("1")) {
				func.addschedule();
			}
			else if(input.equalsIgnoreCase("2")) {
				func.findschedule();
			}
			else if(input.equalsIgnoreCase("3")) {
				cal.repeatprint();
			}
			else if(input.equalsIgnoreCase("h")) {
				help();
			}
			else if(input.equalsIgnoreCase("q")) {
				break;
			}
			else
				continue;
		}
	}

	private static void help() {
		// TODO Auto-generated method stub
		System.out.println("도움말 출력됐습니다.");
	}

		
}

