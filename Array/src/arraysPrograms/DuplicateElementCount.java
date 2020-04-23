package arraysPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElementCount {

	public static void main(String[] args) {
		String[] element={"Abhi","ram","Shyam","Mohan","Abhi","ram","Shyam","Shyam","ram"};
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(String s:element){
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}
			else{
				map.put(s, 1);
			}
		}
		
		for(Entry<String, Integer> s:map.entrySet()){
			System.out.println(s.getKey() + "---" + s.getValue());
		}

	}

}
