package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String name = null, firstName = null, lastName = null;
		String num1 = null, num2 = null;
		int sum = 0;
//		System.out.print("이름 : ");
////		name = sc.next();
////		lastName = sc.next();
////		firstName = sc.next();  
////		name = lastName + firstName;
//		name = sc.nextLine();
//		System.out.println(name + "님 환영합니다");
		
		
		System.out.print("두 정수 입력: ");
		num1 = sc.next();
		num2 = sc.next();
		
		sum += Integer.parseInt(num1);
		sum += Integer.parseInt(num2);
		System.out.printf("두 정수의 합: %d", sum);
	}
}
















