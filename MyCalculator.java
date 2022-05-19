package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj1=new Calculator();
		System.out.println("Addition of 3 number= "+ obj1.add(10, 9, 11));
		System.out.println("Subraction of 2 number ="+ obj1.sub(5, 10));
		System.out.println("Multiplication of 2 number = "+obj1.mul(21.0, 10.5));
		System.out.println("Divison of 2 number ="+obj1.divide(12f,3f));
	}

}
