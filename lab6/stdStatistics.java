package lab6;

public class stdStatistics {

	float num1;
	float num2;
	float num3;
	
	public stdStatistics(float num1, float num2, float num3) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public void calculate_average(float num1, float num2, float num3) {
		
		float average = (num1+num2+num3)/3;
		
		System.out.println("The average of the class is = "+average);
	}
	public void calculate_highest() {
		
		if(num1>num2 && num1 > num3) {
			System.out.println("The highest grade of the class is =" + num1);
		}
		
		else if(num2>num1 && num2 > num3) {
			System.out.println("The highest grade of the class is =" + num2);
		}
		
		else {
			System.out.println("The highest grade of the class is =" + num3);
		}
		
	}
	public float calculate_lowest() {
	
	if(num1<num2 && num1<num3) {
		return num1;
	}
	
	else if(num2<num1 && num2<num3) {
		return num2;
	}
	
	else {
		return num3;
	}
}
}
