package week_7;

import java.util.HashMap;

public class WordCounter {
	
	HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
	
	public WordCounter(String[] tokens) {
		wordLengthFreq(tokens);
	}
	
	public void wordLengthFreq(String[] tokens) {
		frequencies.clear();
		for (String token : tokens) {
			Integer tokenLength = token.length();
			Integer count = frequencies.get(tokenLength);
			if (count == null) {
				frequencies.put(tokenLength, 1);
			} else {
				frequencies.put(tokenLength, count + 1);
			}
		}
	}
	
	public HashMap<Integer, Integer> getFreqDist() {
		return frequencies;
	}
	
	public int maxVal() {
		int max = 0;
		for (int i : frequencies.values()) {
			if (i > max) max = i;
		}
		return max;
	}
	
	public double[] map2array() {
		if (frequencies.size() == 0) {
			return new double[] {};
		}
		
		int longestWord = 0;
		for (Integer wordLength : frequencies.keySet()) {
			if (wordLength > longestWord) longestWord = wordLength;
		}
		double[] freqDistArray = new double[longestWord + 1];
		
		int maximumValue = maxVal();
        
        for (int i = 0; i < freqDistArray.length; i++) {
            Integer frequency = frequencies.get(i);
            if (frequency == null) {
                freqDistArray[i] = 0;
            }
            else {
                freqDistArray[i] = ((double) frequency) / maximumValue * 100;
            }
        }
        return freqDistArray;
	}
	
	
	public static void main(String[] args) {
		Tokenizer tokenizer = new Tokenizer("melville-moby_dick.txt");
		String[] tokens = tokenizer.getTokens();

		WordCounter wordCounter = new WordCounter(tokens);
		System.out.println(wordCounter.getFreqDist());
		double[] points = wordCounter.map2array();

		int n = points.length;
		StdDraw.clear();
		StdDraw.setXscale(0, n - 1);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(0.5 / n);
		for (int i = 0; i < n; i++) {
		    StdDraw.line(i, 0, i, points[i]);
		}
	}

}
