package Java8_Par;

import java.util.ArrayList;

public class Min_Par {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(80);
		l.add(8);
		
		//System.out.println(l);
		
		Integer min= l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		//System.out.println("Mininmum Value is :" + min);
		
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		//System.out.println("Max Valie is :" + max);
		
		//l.stream().forEach(l->System.out.println(l));
		
		//Stream s = c.Stream();
		// s--> object then we need to configure the stream
		//filter(Predicate<T> t)
		//map(Function<T, R> f)
		
		
		
		
	}

}
