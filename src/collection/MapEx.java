package collection;

import java.util.HashMap;
import java.util.HashSet;

public class MapEx {
	public static void main(String[] args) {
		
		 HashMap<Long , String> pessoa = new HashMap<>();
		 
		 pessoa.put(12345678917L,"Hector");
		 pessoa.put(12345678919L, "Michelli");
		 
		 System.out.println(pessoa);
		 
		 System.out.println(" " + pessoa.get(12345678917L));
		 
		 
		
	}

}
