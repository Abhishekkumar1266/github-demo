package arraysPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElement {
	
	public static void main(String[] args) {
		 String str[] = { "yogi", "ram", "ram", "yogi", "yogi", "yogi", "raju", "raju", "ram", "yogi","hhhh" };
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        for (String s : str) {
	            if (map.containsKey(s)) {
	                map.put(s, map.get(s) + 1);//get(): java.util.HashMap.get()method returns
	                                         //the value to which the specified key is mapped, 
	                                          //or null if this map contains no mapping for the key.
	               
	            } else {
	                map.put(s, 1);
	            }
	        }
	        for (Entry<String, Integer> e : map.entrySet()) {
	            System.out.println(e.getKey() + "---" + e.getValue());

	        }
	    }

}
