package calendar;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {
	Scanner scan = new Scanner(System.in);
	ArrayList<Schedule> sch = new ArrayList<Schedule>();
	
	public void addschedule() {
		
		System.out.println("[일정 등록] 날짜를 입력하세요.");
		prompt();
		String days = scan.next();
		System.out.println("일정을 입력하세요");
		prompt();
		String context = scan.next();
		sch.add(new Schedule(days,context));
		System.out.println("일정이 등록되었습니다.");
	}
	
	public void prompt() {
		System.out.print("> ");
	}
	
	
	public void findschedule() {
		int count = 0;
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		prompt();
		String days = scan.next();
		String[] tempsch = new String[10];
		for(int i = 0; i<sch.size();i++) {
			if( days.equals(sch.get(i).getdays())){
				tempsch[count] = sch.get(i).getcontext();
				count ++;
			}
		}
		System.out.printf("%d개의 일정이 있습니다\n",count);
		
		for(int i = 0; i<count; i++) {
			
				System.out.printf("%d. %s\n",i,tempsch[i]);
		
			
		}
		

		
	}
}
