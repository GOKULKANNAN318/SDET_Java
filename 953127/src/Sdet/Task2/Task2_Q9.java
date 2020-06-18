package Sdet.Task2;

//character to string and viceversa

public class Task2_Q9 {
	
	public static void main(String[] args) {
		char ch = 'c';
		String st = Character.toString(ch);
		
		System.out.println("The string is: " + st);
		
		char[] ch1 = {'a', 'e', 'i', 'o', 'u'};

		String st1 = String.valueOf(ch1);
		String st2 = new String(ch1);

		System.out.println(st1);
		System.out.println(st2);
		
		}

}
