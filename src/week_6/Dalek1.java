package week_6;

public class Dalek1 {
	
	private double batteryCharge = 5.0; // instance variable

    public void batteryReCharge(double c) {
        // ADD CODE HERE
    	this.batteryCharge += c;
    	System.out.printf("Battery charge is: %s\n", this.batteryCharge);
    }

    public void move(int distance) {
        // ADD CODE HERE
    	for (int i = 1; i < distance + 1 && batteryCharge >= 0.5; i++) {
    		this.batteryCharge -= 0.5;
    		System.out.printf("[%s] ", i);
    	}
    	if (this.batteryCharge < 0.5) System.out.print("Out of power!\n");
    }
	
	public static void main(String[] args) {
	    Dalek1 d = new Dalek1(); // start off with a well-charged battery
	    d.move(11);              // move around and use up the charge
	    d.batteryReCharge(2.5);  // get a new charge
	    d.batteryReCharge(0.5);  // add a bit more
	    d.move(5);               // move some more
	}
}
