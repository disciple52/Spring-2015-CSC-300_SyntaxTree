public class VarDefStatement extends Object //invisible part extends Object //Object is the parent of anything with "invisible ink"
{
	private VarExpression theVarExpr;
	private MathExpression theMathExpr;
	
	public VarDefStatement(VarExpression theVarExpr, MathExpression theMathExpr)
	{
		this.theVarExpr = theVarExpr;
		this.theMathExpr = theMathExpr;
	}
	
	public VarExpression getTheVarExpr() {
		return theVarExpr;
	}

	public MathExpression getTheMathExpr() {
		return theMathExpr;
	}

	public boolean isSpecialMathExpr()
	{
		return this.theMathExpr.isSpecial();
	}
	public String toString()
	{
		//return "hello world " + super.toString();
		//write this such that it rebuilds the String version of the original statement.  You MAY NOT just use the store string variable theStmt.
		return this.theVarExpr.toString() + " = " + this.theMathExpr.toString() + ";";
	}
}
