import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.mustache.Value;

public class testcases2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashMap<Integer, String> map= new HashMap<>();
		map.put(1, "krishna");
		map.put(2, "sai");
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		Hashtable<Integer, String> tab= new Hashtable<>();
		tab.put(1, "amma");
		tab.put(2, "nanna");
		
		for(Map.Entry m:tab.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

/*HashMap<Integer , String> map = new HashMap<Integer,String>();


map.put(1, "sai");
map.put(2, "krishna");
map.put(3, "mada");
map.put(4, "amma");

System.out.println(map);

for(Map.Entry m:map.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
}
	}
*/
}
}
