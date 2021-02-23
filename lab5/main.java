package lab5;


//	class Lamp{
//		boolean isOn;
//	void turnOn() {
//		isOn=true;
//		System.out.println("Light on?"+isOn);
//	}
//	void turnOff() {
//		isOn=false;
//		System.out.println("Light on?"+isOn);
//	}
//	
	public class main {
		String lang;
		int num = 5;
		private main(String language) {
			//num = this.num;
			num = 10;
			//System.out.println("This is the main constructor");
			System.out.println("The language is" + language);
		}
	public static void main(String[] args) {
//			Lamp led = new Lamp();
		//main obj = new main();
		//System.out.println("The number is = " + obj.num);
		main obj1 = new main("Python");
		main obj2 = new main("Java");
		
		System.out.println("The number is = " +obj1.num);
		}
	
	//Task1 
//	public class mainClass {
//
//		public static void main(String[] args) {
//			lamps l = new lamps();
//			
//			Scanner s = new Scanner(System.in);
//			System.out.print("Enter a number: ");
//			int led = s.nextInt();
//			
//			if(led == 1)
//				l.turnON();
//			else if(led == 2)
//				l.turnOF();
//		}
//
//	}

	
}

	