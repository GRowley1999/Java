package week_6;

public class DNAStrand {
	
	private String dna;
	
	public DNAStrand(String dna) {
		this.dna = dna;
	}
	
	public boolean isValidDNA() {
		if (dna == null || dna == "") {
			return false;
		} else {
			String dnaWithoutATCG = dna.replace("A", "").replace("T", "").replace("C", "").replace("G", "");
			return dnaWithoutATCG.length() == 0;
		}
	}
	
	public String complementWC() {
		String swapAT = dna.replace("T", "t").replace("A", "T").replace("t", "A");
        String swapATCG = swapAT.replace("G", "g").replace("C", "G").replace("g", "C");
        return swapATCG;
	}
	
	public String palindromeWC() {
		String complement = complementWC();
		int N = complement.length();
		String newStr = "";
		for (int i = N - 1; i >= 0; i--) {
			newStr += complement.charAt(i);
		}
		return newStr;
	}
	
	public boolean containsSequence(String seq) {
		if (dna.contains(seq)) return true;
		return false;
	}
	
	public String toString() {
		return dna;
	}
}
