
public abstract  class Song implements myList {

	private String name;
	private String artist;
	private float playTime;
	
	/**
	 * Constructor for the Song class to initialize the fields
	 * @param name		name of the song
	 * @param artist	name of the artist
	 * @param playTime	duration of the song
	 */
	public Song(String name, String artist, float playTime)
	{
		this.name = name;
		this.artist = artist;
		this.playTime = playTime;
	}
	
	/**
	 * Overloaded toString method to format the string to display their
	 * Song name, Artist name, and play time
	 */
	public String toString()
	{
		String s =  "Song name: " + name + "\n"
				 +  "Artist name: " + artist + "\n"
				 +  "Play time: " + playTime + "\n";

		return s;
	}
	
	/**
	 * Accessor method named getPlayTime
	 * @return playTime	duration of the song
	 */
	public float getPlayTime()
	{
		return playTime;
	}
	
	/**
	 * Accessor method named getArtist
	 * @return	artist	name of the artist
	 */
	public String getArtist()
	{
		return artist;
	}
	
	/**
	 * Accessor method named getSongName
	 * @return	name	name of the song
	 */
	public String getSongName()
	{
		return name;
	}
	
	/**
	 * Overloaded equals method to return true if the inputed song object
	 * equals the song object in question
	 * @param s	inputed song object
	 * @return	the validity of comparing two song objects
	 */
	public boolean equals(Song s)
	{
		Song song = new Song(name,artist,playTime);
		if(song == s) {
			return true;
		}
		else {
			return false;
		}
	}
}
	
