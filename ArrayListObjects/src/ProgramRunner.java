import java.util.ArrayList;

public class ProgramRunner
	{

		public static void main(String[] args)
			{
				ArrayList<Programs>TVShows = new ArrayList<Programs>();	
				TVShows.add (new Programs("Spongebob Squarepants", "Comedy", 12));
				TVShows.add (new Programs("Stranger Things", "Sci-Fi", 3 ));
				TVShows.add (new Programs("The Simpsons", "Comedy", 30));
				TVShows.add (new Programs("Flash", "Sci-fi", 5));
				TVShows.add (new Programs("The Office", "Comedy", 9));
			}

	}
