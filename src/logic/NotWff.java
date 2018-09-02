package logic;

public class NotWff extends Wff {
	
	private Wff wff;
	private Operator op = null;
	
	public NotWff(Wff wff) {
		this.wff = wff;
		this.op = Operator.NEG;
	}
	
	public boolean eval(Valuation val) {
		return !(wff.eval(val));	
	}
	
	@Override
	public String toString() {
		return String.format("%s%s", op, wff);
	}
	
}
