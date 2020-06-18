package Sdet.Task2;

//Frequency of char in a string

public class Task2_Q4 {
	
	public static void main(String[] args) {
      String str = "This website is awesome.";
      char ch = 'e';
      int frequency = 0;

      for(int i = 0; i < str.length(); i++) {
          if(ch == str.charAt(i)) {
              ++frequency;
          }
      }

      System.out.println("Frequency of " + ch + " = " + frequency);
  }


}
