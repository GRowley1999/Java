package week_6;

public class MusicTrack {

	private String artist;
	private String title;
	
	public MusicTrack(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		String s = String.format("%s | %s", this.title, this.artist);
		return s;
	}
}
