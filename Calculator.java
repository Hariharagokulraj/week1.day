package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3)
	 {
		 return num1+num2+num3;
	 }
	 public int sub(int num1, int num2)
	 {
		 return  num1-num2;
	 }
	 
	public double mul(double num1, double num2)
	{
		return num1 * num2;
	}
	public float divide(float num1, float num2)
	{
		return num1 / num2;

		}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println("Addition of 3 number= "+ obj.add(10, 9, 11));
		System.out.println("Subraction of 2 number ="+ obj.sub(5, 10));
		System.out.println("Multiplication of 2 number = "+obj.mul(21.0, 10.5));
		System.out.println("Divison of 2 number ="+obj.divide(12f,3f));
	}
}
