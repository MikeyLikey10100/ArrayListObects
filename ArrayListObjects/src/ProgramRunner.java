import java.util.ArrayList;

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
			for( Programs n : TVShows)
				{	
					System.out.print(n.getTitle() + ", ");
					n.setNumberOfSeasons(n.getNumberOfSeasons() + 1);
					System.out.println(n.getNumberOfSeasons());
					
				}
		
			
		}

	}
