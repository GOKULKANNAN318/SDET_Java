package Sdet.Task2;

//Remove all white space from a string

public class Task2_Q6 {
	
	 public static void main(String[] args) {
	        String sentence = "I   a  m  fin e  .How about u?";
	        System.out.println("Original sentence: " + sentence);

	        sentence = sentence.replaceAll("\\s", "");
	        System.out.println("After replacement: " + sentence);
	    }


}
