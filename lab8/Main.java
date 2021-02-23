package lab8;

class Animal{
	String name;
	
	public void eat() {
		System.out.println("I can eat dog food");
	}
	
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal{
	
	public void display() {
		System.out.println("My name is : " + name);
		}
	
	public void bark() {
		System.out.println("Dog can bark");
		}		
			
		@Override
	public void eat() {
		super.eat();
		System.out.println("I can eat dog food");
		}
	}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Dog();
		obj.name = "Karabaþ";
		obj.display();
		obj.eat();

	}

}
