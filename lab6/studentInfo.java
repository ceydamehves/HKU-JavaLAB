package lab6;

public class studentInfo {

	public int id;
	public String name;
	public String lastname;
	private int midterm;
	private int final_grade;
	public float average;
	
	public studentInfo(int id, String name, String lastname, int midterm, int final_grade) {
		
		this.id = id; 
		this.name = name;
		this.lastname = lastname;
		this.midterm = midterm;
		this.final_grade = final_grade;
	}
	
	public float calculateOBS(int midterm, int final_grade) {
		
		average = (float) (midterm*0.4+final_grade*0.6);
		
		return average;
	}
	
	public void print_info() {
		
		System.out.println(id+"\t\t"+name+"\t"+lastname+"\t\t"+midterm+"\t\t"+final_grade+"\t\t"+average);
	
	}
	public static void main(String[] args) {
		
		studentInfo std1 = new studentInfo(1, "Nihat", "Þimþek", 80,90);
		studentInfo std2 = new studentInfo(2, "Hasan", "Göðebakan", 50,85);
		studentInfo std3 = new studentInfo(3, "Derya", "Bel", 75,95);
		
		std1.average = std1.calculateOBS(std1.midterm, std1.final_grade);
		std2.average = std2.calculateOBS(std2.midterm, std2.final_grade);
		std3.average = std3.calculateOBS(std3.midterm, std3.final_grade);
		
		System.out.println("Student ID\tName\tLastName\t Midterm\tFinal \t Average");
		
		std1.print_info();
		std2.print_info();
		std3.print_info();
		
		stdStatistics obj = new stdStatistics(std1.average, std2.average, std3.average);
		
		obj.calculate_average(std1.average, std2.average, std3.average);
		
		obj.calculate_highest();
		
		float number = obj.calculate_lowest();
		System.out.println("The lowest grade of class is ="+number);
		//System.out.println("The lowest grade of class is ="+obj.calculate_lowest());
		
	}

}