package classTest;

class Student{
	
	int number;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	
	public Student() {;}

	public Student(int number, int kor, int eng, int math) {
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
	}
}

public class ClassTask2 {
	public static void main(String[] args) {
		Student 한동석 = new Student(1, 100, 90, 30);
		System.out.println("총 점: " + 한동석.total);
		System.out.println("평균: " + 한동석.average);
	}
}



















