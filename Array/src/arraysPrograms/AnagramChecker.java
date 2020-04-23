package arraysPrograms;

import java.util.Arrays;

public class AnagramChecker {
	
	public boolean isAnagram(String input1,String input2){
		char[] s1=input1.toCharArray();
		Arrays.sort(s1);
		
		char[] s2=input2.toCharArray();
		Arrays.sort(s2);
		
		System.out.println(Arrays.equals(s1, s2));
		return Arrays.equals(s1, s2);
	}
	
	public static void main(String[] args) {
		AnagramChecker anagramChecker=new AnagramChecker();
		anagramChecker.isAnagram("Rami","iRam");
	}

}



