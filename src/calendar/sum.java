package calendar;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		String strtemp = scanner.nextLine();
		String[] str = strtemp.split(" ");
		int[] num = new int[2];
		for(int i = 0; i<2; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		System.out.printf("두 수의 합은 %d입니다.",(num[0]+num[1]));
		
		scanner.close();
	}

}
