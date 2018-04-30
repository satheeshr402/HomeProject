
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
	
	public void duplicateByMap(String[] input){
		
		Map<String,Integer> cntMap = new HashMap<String,Integer>();
		
		for (String s :input){
			if (cntMap.containsKey(s)){
				cntMap.put(s, cntMap.get(s)+1);
			}else{
				cntMap.put(s, 1);
			}
		}
		
		for (Map.Entry<String, Integer> i : cntMap.entrySet()){
			if (i.getValue() > 1){
				System.out.println(i.getKey() +","+i.getValue());
			}
		}
		
	}
	

	public static void main(String[] args) {

		String[] s ={"one","two","three","two","one","four"};
		
		new DuplicateString().duplicateByMap(s);
		
		Set<String> unique = new HashSet<String>();
		List<String> result = new ArrayList<String>();
		for(String iter : s){
			
			if (unique.contains(iter)){
				result.add(iter);
			}else{
				unique.add(iter);
			}
		}
		
		System.out.println(Arrays.toString(result.toArray()));
	}

}
