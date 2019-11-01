import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProgramRunner
	{

		public static void main(String[] args)
			{
				printList();
			}
		public static void printList()
		{
			ArrayList<Programs>TVShows = new ArrayList<Programs>();	
			TVShows.add (new Programs("Spongebob Squarepants", "Comedy", 12 ));
			TVShows.add (new Programs("Stranger Things", "Sci-Fi", 3  ));
			TVShows.add (new Programs("The Simpsons", "Comedy", 30 ));
			TVShows.add (new Programs("The Flash", "Sci-fi", 6 ));
			TVShows.add (new Programs("The Office", "Comedy", 9 ));
			
			
			int largestWord = Integer.MIN_VALUE; 
			
			for(int i = 0; i < TVShows.size(); i++) {
				if(largestWord < indexOf(TVShows.get(i).getTitle()))
			}
			
			
			
			for( Programs n : TVShows)
				{	
					System.out.print(n.getTitle() + ", ");
					n.setNumberOfSeasons(n.getNumberOfSeasons() + 1);
					System.out.println(n.getNumberOfSeasons());
				
				}
		
		
//			int largestString = TVShows.size();
//			int index = 0;
//			for (int i = 0; i < TVShows.size(); i++ )
//			{
//				if(TVShows.size() >  largestString)
//				{
//					largestString = TVShows.size();
//					index = i;
//				}
//			}
//			System.out.println();
		
			
		}

	}
