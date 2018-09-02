package week_6;

public class Favourites {
	
	private final int N = 5;
	private int count = 0;
	private MusicTrack[] favTracks = new MusicTrack[N];
	
	public void addTrack(String title, String artist) {
		MusicTrack newTrack = new MusicTrack(title, artist);
		if (count == 5) {
			System.out.println("Sorry, can't add: " + newTrack + "\n");
		} else {
			favTracks[count] = newTrack;
			count++;
		}
		
	}
	
	public void showFavourites() {
		for (MusicTrack mt : favTracks) {
			if (mt != null) {
				System.out.println(mt);
			}
		}
	}
	
	public static void main(String[] args) {
		Favourites favourites = new Favourites();
		favourites.addTrack("Fun", "Some Nights");
		favourites.addTrack("Oliver Tank", "Help You Breathe");
		favourites.addTrack("Horse Feathers", "Fit Against the Country");
		favourites.addTrack("Emile Sande", "Country House");
		favourites.addTrack("Fun", "Walking the Dog");
		favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
		favourites.showFavourites();
	}
}
