package logic;

public class OrWff extends BinaryWff {

	private Wff left;
	private Wff right;
	private Operator op;
	
	public OrWff(Wff left, Wff right) {
		super(left, right);
		setOp(Operator.OR);
	}
	
	public boolean eval(Valuation val) {
		return getLeft().eval(val) || getRight().eval(val);
	}
}
	
