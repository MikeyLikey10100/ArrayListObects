
public class Programs
	{
		private String title ; 
		private String genre ;
		private int numberOfSeasons;
		public String getTitle()
			{
				return title;
			}
		public void setTitle(String title)
			{
				this.title = title;
			}
		public String getGenre()
			{
				return genre;
			}
		public void setGenre(String genre)
			{
				this.genre = genre;
			}
		public int getNumberOfSeasons()
			{
				return numberOfSeasons;
			}
		public void setNumberOfSeasons(int numberOfSeasons)
			{
				this.numberOfSeasons = numberOfSeasons;
			}
		public Programs (String t , String g , int n )
		{
			title =t;
			genre = g;
			numberOfSeasons = n;
		}
	}
