package day4;

public class calculator2 {
	public int multiplyTwoNumber(int a,int b) {
		int c=a*b;
		return c;
		
	}
	public void dividedTwoNumber(int total, int b) {
		int c=total / b;
	}
	public static void main(String[] args) {
		calculator2 calc=new calculator2();
		int total = calc.multiplyTwoNumber(10,20);
		System.out.println(total);
		calc.dividedTwoNumber(total, 10);
	
	}

}

