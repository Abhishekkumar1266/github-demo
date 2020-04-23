package arraysPrograms;

public class VowelFromString {

	public static void main(String[] args) {
		String a="My name is Abhishek";
		int counter=0;
		char[] m=a.toCharArray();
		for(int i=0;i<=a.length()-1;i++){
			if(m[i]=='a'||m[i]=='e'||m[i]=='o'||m[i]=='i'||m[i]=='u'){
				System.out.print(m[i]);
				counter++;
			}
		}
		System.out.println(counter);

	}

}
