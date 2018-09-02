package music;

import java.util.ArrayList;

public class Favourites {
	
	private ArrayList<MusicTrack> favTracks = new ArrayList<MusicTrack>();
	
	public void addTrack(String title, String artist) {
		MusicTrack newTrack = new MusicTrack(title, artist);
		favTracks.add(newTrack);	
	}
	
	public void showFavourites() {
		for (MusicTrack mt : favTracks) {
				System.out.println(mt);
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
