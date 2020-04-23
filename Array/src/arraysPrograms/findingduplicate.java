package arraysPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findingduplicate {

	public static void main(String[] args) {
		int arr[] = {2, 5, 3, 1, 8, 7, 5, 3};
		/**
		* Using Java HashMap
		*/
		Map<Integer, Integer> arrMap = new HashMap<>();
		//Traverse an array	
		for(int i = 0; i < arr.length; i++) {
		/*
		if element exists in a	map, then increment it's count by 1,
		otherwise assigned a value 1
		*/		
		if(arrMap.containsKey(arr[i])) {
		arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
		} else {
		arrMap.put(arr[i], 1);
		}
		}
		Set<Entry<Integer, Integer>> entry = arrMap.entrySet();
		/*
		*Traverse the map, If any key has value greater than 1
		*It means, it is duplicate element in an array
		*/	
		for(Entry<Integer, Integer> ent: entry) {
		
		System.out.println(ent.getKey()+"----"+ent.getValue());
		
		}
		}
		
		/*for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("duplicate element is"+a[j]);
				}
				
			}
		}*/

	}


