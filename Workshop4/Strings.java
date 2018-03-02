
public class Strings {

	public static void main(String[] args) {
		//printName();
		//equalsMethod();
		//stringLength();
		//indexOfMethod();
		//charAtMethod();
		//containsMethod();
		//substringMethod();
	}

	public static void printName() {
		//create a String with your name - ""
		String myName1 = "Your Name";
		String myName2 = new String("Your Name");
		String s1 = "hello";
		String s2 = "world";
		
		//print a message to introduce yourself (concatenation)
		System.out.println("Hi, my name is " + myName1);
		System.out.println(s1 + " " + s2);
		
		//print(2+2) vs print("2" + "2")
		System.out.println(2+2);
		System.out.println("The number 2: " + 2);
		System.out.println("2" + "2");
	}
	
	public static void equalsMethod() {
		//create 2 Strings and set it equal to your name
		String myName1 = new String("Your Name");
		String myName2 = new String("Your Name");

		System.out.println(myName1.equals(myName2));
		System.out.println(myName1 == myName2);
	}

	public static void stringLength() {
		String s1 = "hello world";
		System.out.println(s1.length());
	}

	public static void indexOfMethod() {
		String s = "mississippi";
		System.out.println(s.indexOf("s")); 
		System.out.println(s.indexOf("i")); 
		System.out.println(s.indexOf("o")); //since "o" doesn't exist in the string, it will return -1
		System.out.println(s.indexOf("issi")); //can also search for strings
	}
	
	public static void charAtMethod() {
		String s = 	"Coders Across Disciplines";
		System.out.println(s.charAt(0)); //prints first character in string
		System.out.println(s.charAt(s.length()-1)); //prints last character in string
	}

	public static void containsMethod() {
		String s1 = "computer science";
		System.out.println(s1.contains("comp"));
		System.out.println(s1.contains("CAD"));
	}

	public static void substringMethod() {
		String s = "Hello World";
		System.out.println(s.substring(0,5)); //prints characters in indices [0, 5)
		System.out.println(s.substring(6)); //will print from index 6 to the end
		System.out.println(s.substring(s.indexOf("World")));
	}

}
