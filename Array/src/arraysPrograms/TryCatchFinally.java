package arraysPrograms;

import java.util.HashMap;
import java.util.Map;

public class TryCatchFinally 
{
	
	public static void main(String[] args) {
		/*List<String> li=new ArrayList<String>();
		li.add("abhi");
		li.add("sid");
		li.add("anu");
		
		for (String string : li) {
			
			System.out.println(string);

	}*/
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		for (Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("My key is "+  entry.getKey()   +"     My value is "+   entry.getValue());
		} 
		
		String a =new String("abc");
		a.concat("bgh");
		//a.trim()
		System.out.println(a);
		
		StringBuffer s=new StringBuffer("hgf");
		s.append("lmodhd");
		System.out.println(s);

	
}


}
