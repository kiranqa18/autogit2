package inque;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Par {
	
	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("Game of Thrones");
		
		tvSeries.add("Breaking Bad");
		
		tvSeries.add("The big Bang Theroy");
		
		tvSeries.add("The walking Dead");
		
		tvSeries.add("Prison Break");
		
		
		tvSeries.forEach(action->{
			System.out.println(action);
		});
		
		
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		
	}
	
	
	
	

}
