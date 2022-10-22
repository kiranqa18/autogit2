package inque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("Game of Thrones");
		tvSeries.add("breaking Bad");
		tvSeries.add("The Big Bang Theroy");
		tvSeries.add("The walking Dead");
		tvSeries.add("Prison Break");
		
		tvSeries.forEach(shows -> {
			
			System.out.println(shows);
			
		});
		
		System.out.println("----------");
		
		Iterator<String> it =tvSeries.iterator();
		
		
		while(it.hasNext()) {
			
			String shows = it.next();
			
			System.out.println(shows);
		}
		
		System.out.println("----------");
		
		it = tvSeries.iterator();
		
		it.forEachRemaining(show ->{
			System.out.println(show);
		});
		
		System.out.println("----------");
		
		for(String shows:tvSeries) {
			System.out.println(shows);
		}
		
		
		System.out.println("----------");
		
		
		ListIterator<String> tvSeriesListIter1 = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIter1.hasPrevious()) {
			
			String show = tvSeriesListIter1.previous();
			
			System.out.println(show);
		}
		
	}

}
