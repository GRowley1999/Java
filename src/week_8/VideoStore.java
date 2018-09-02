package week_8;

import java.util.ArrayList;

public class VideoStore {
	
	ArrayList<Video> videos = new ArrayList<Video>();
	
	public boolean addVideo(String title) {
		for (Video video : videos) {
			if (video.getTitle().equals(title)) {
				System.out.println(title + " is already in stock.");
				return false;
			}
		}
		videos.add(new Video(title));
		return true;
	}
	
	public Video getVideo(String title) {
		for (Video video : videos) {
			if (video.getTitle().equals(title)) {
				return video;
			}
		}
		System.out.println("Sorry, cannot find the requested video in the catalogue");
		return null;
	}
	
	public boolean checkOutVideo(String title) {
		Video video = getVideo(title);
		if (video != null) {
			return video.checkOut();
		}
		return false;
	}
	
	public boolean returnVideo(Video video) {
		if (!videos.contains(video)) {
			System.out.println("Sorry, this video did not come from this store");
			return false;
		}
		return video.returnToStore();
	}
	
	public void rateVideo(Video video, int rating) {
		video.addRating(rating);
	}
	
	public double getAverageRatingForVideo(Video video) {
		return video.getAverageRating();
	}
	
	public Video[] getCheckedOut() {
		int numberCheckedOutVideos = 0;
		int i = 0;
		
		for (Video video : videos) {
			if (video.isCheckedOut()) {
				numberCheckedOutVideos++;
			}
		}
		
		Video[] checkedOutVideos = new Video[numberCheckedOutVideos];
		
		for (Video video : videos) {
			if (video.isCheckedOut()) {
				checkedOutVideos[i] = video;
				i++;
			}
		}
		
		return checkedOutVideos;
	}
	
	public Video mostPopular() {
		if (videos.size() == 0) {
			return null;
		}
		
		double heighestAverageRating = 0.0;
		Video mostPopular = null;
		for (Video video : videos) {
			if (video.getAverageRating() > heighestAverageRating) {
				mostPopular = video;
				heighestAverageRating = video.getAverageRating();
			}
		}
		return mostPopular;
	}
}
