package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String name = null, firstName = null, lastName = null;
		String num1 = null, num2 = null;
		int sum = 0;
//		System.out.print("�̸� : ");
////		name = sc.next();
////		lastName = sc.next();
////		firstName = sc.next();  
////		name = lastName + firstName;
//		name = sc.nextLine();
//		System.out.println(name + "�� ȯ���մϴ�");
		
		
		System.out.print("�� ���� �Է�: ");
		num1 = sc.next();
		num2 = sc.next();
		
		sum += Integer.parseInt(num1);
		sum += Integer.parseInt(num2);
		System.out.printf("�� ������ ��: %d", sum);
	}
}
















