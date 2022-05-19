package week1.day2;

public class ArmstrongNumber {
public static void main(String[] args) {
	int input=1634;
	int sum=0;
	while (input > 0) {
		int rem=input % 10;
		sum= sum + (rem*rem*rem*rem);
				input= input / 10;
	}
	System.out.println("Find the Given number is Armstrong or not");
	if(input== sum)
	System.out.println("Given number is Armstrong =" + sum);
	else
		System.out.println("Given number is Not Armstrong=" + sum);
}
}
