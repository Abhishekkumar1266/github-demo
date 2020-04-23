package arraysPrograms;



public class StringSorting {
	
	

	public static void main(String[] args) {
		/*String[] a={"abc","def","hig","zmn","rof"};
		
        Arrays.sort(a);
       for (String string : a) {
		System.out.println(string);
	}*/
		int num = 1234, reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
       		
	}

}
