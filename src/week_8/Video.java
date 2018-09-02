package week_8;

import java.util.ArrayList;

public class Video {
	
	private String title;
	private boolean checkedOut = false;
	private ArrayList<Integer> ratings = new ArrayList<Integer>();
	
	public Video(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean addRating(int rating) {
		if (rating >= 1 && rating <= 5) {
			ratings.add(rating);
			return true;
		} else {
			System.out.println(rating + " should be between 1 and 5.");
			return false;
		}
	}
	
	public double getAverageRating() {
		if (ratings.size() == 0) {
			return 0.0;
		}
		int sumRatings = 0;
		int numberOfRatings = ratings.size();
		double averageRating = 0.0;
		for (Integer rating : ratings) {
			sumRatings += rating;
		}
		averageRating += sumRatings / (double) numberOfRatings;
		return averageRating;
		
	}
	
	public boolean checkOut() {
		if (checkedOut) {
			System.out.println(toString() + " is already checked out.");
			return false;
		}
		checkedOut = true;
		return true;
	}
	
	public boolean returnToStore() {
		if (!checkedOut) {
			System.out.println(toString() + " is not checked out.");
			return false;
		}
		checkedOut = false;
		return true;
	}
	
	public boolean isCheckedOut() {
		return checkedOut;
	}
	
	public String toString() {
		return String.format("Video[title=\"%s\", checkedOut=%s]", title, checkedOut);
	}
}
