package arraysPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String a="My name is Abhishek";
		/*char[] b=a.toCharArray();
		
		for(int i=a.length()-1;i>=0;i--){
			System.out.print(b[i]);
		}*/
		
		String[] b=a.split(" ");
		String c="";
		
		for(int i=b.length-1;i>=0;i--){
			c=c+b[i]+" ";
		}
		System.out.println(c);

	}

}
