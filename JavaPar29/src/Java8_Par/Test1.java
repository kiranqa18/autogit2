package Java8_Par;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String[] args) {
		
		//ArrayList<String> al = new ArrayList<String>();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//al.add("Ravi");al.add("Kiran");al.add("RAVIKiran");al.add("INDIA");
		
		
		//List<String> l1= al.stream().filter(s->s.length()>4).collect(Collectors.toList());
		
		
		//long l1= al.stream().filter(s->s.length()>4).count();
		
		al.add(10);al.add(20);al.add(30);al.add(55);al.add(40);
		
		//System.out.println(al);
		
	List<Integer> l1=	al.stream().sorted().collect(Collectors.toList());
		
		
		System.out.println(l1);
		
	}

}
