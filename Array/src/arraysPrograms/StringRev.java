package arraysPrograms;

public class StringRev {

	public static void main(String[] args) {
		String a="Menaka";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--){
			b=b.charAt(i)+"";
		}

		
		System.out.println(b);
	}

}
