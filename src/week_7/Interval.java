package week_7;

public class Interval {
	
	private double left;
	private double right;
	
	public Interval(double left, double right) {
		this.left = left;
		this.right = right;
	}
	
	public boolean doesContain(double x) {
		return !isEmpty() && (x > this.left && x < this.right);
	}
	
	public boolean isEmpty() {
		return this.left > this.right;
	}
	
	public boolean intersects(Interval b) {
		if (isEmpty() || b.isEmpty()) {
			return false;
		}
		if (b.left > this.right) {
			return false;
		}
		if (b.right < this.left) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		if (!isEmpty()) {
			return String.format("Interval: [%s, %s]", this.left, this.right);
		} else {
			return "Interval: (EMPTY)";
		}
	}
}
