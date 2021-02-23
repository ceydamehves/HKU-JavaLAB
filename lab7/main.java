package lab7;

public class main {
	public static void main(String[] args) {
			// create strings
//			String first = "Java";
//			String second = " and Python";
			// print strings
//			System.out.println("The lenght of the "+first+" is "+ first.length() ); // print Java
//			System.out.println("The lenght of the "+second+" is "+ second.length() ); // print Java
//			
//			String joinedString = first.concat(second);
//			System.out.println("Joined String: " + joinedString);
			
			//TASK 1
			String name = "Ceyda";
			String surname = " Keklik";
			String newString = name.concat(surname);
			System.out.println("Joined String: " + newString);
			
			// create 3 strings
//			String first = "java programming";
//			String second = "java programming";
//			String third = "python programming";
//			
			// compare first and second strings
			
//			boolean result1 = first.equals(second);
//			System.out.println("Strings first and second are equal: " + result1);
//			
//			boolean result2 = first.equals(third);
//			System.out.println("Strings first and third are equal: " + result2);
			
//			String str1 = "program";
//			// from 1st to the 7th character
//			System.out.println(str1.substring(0, 7)); // program
//			// from 1st to the 5th character
//			System.out.println(str1.substring(0, 5)); // progr
//			// from 4th to the 5th character
//			System.out.println(str1.substring(3, 5)); // gr
			
			//TASK 2
			String str2 = "Today we are covering string functions";
			System.out.print(str2.substring(13,21));
			
//			String str1 = "abc cba";
//			// all occurrences of 'a' is replaced with 'z'
//			System.out.println(str1.replace('a', 'z')); // zbc cbz
//			// all occurences of 'L' is replaced with 'J'
//			System.out.println("Lava".replace('L', 'J')); // Java
//			// character not in the string
//			System.out.println("Hello".replace('4', 'J')); // Hello
			
			String str1 = "Learn Java";
			String str2 = "Learn\nJava";
			// first character
			System.out.println(str1.charAt(0)); // 'L'
			// seventh character
			System.out.println(str1.charAt(6)); // 'J'
			// sixth character
			System.out.println(str2.charAt(5)); // '\n'
}
}
