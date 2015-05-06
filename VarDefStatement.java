public class VarDefStatement //invisible part extends Object //Object is the parent of anything with "invisible ink"
{
	private VarExpression theVarExpr;
	private MathExpression theMathExpr;
	private Variable theVariable;
	
	public VarDefStatement(VarExpression theVarExpr, MathExpression theMathExpr)
	{
		this.theVarExpr = theVarExpr;
		this.theMathExpr = theMathExpr;
	}
	
	public VarDefStatement(Variable theVariable)
	{
		this.theVariable = theVariable;
	}
	
	public String toString()
	{
		//return "hello world " + super.toString();
		//write this such that it rebuilds the String version of the original statement.  You MAY NOT just use the store string variable theStmt.
		if(theMathExpr != null)
		{
			return "Original Statement: " + this.theVarExpr.toString() + " = " + this.theMathExpr.toString() + ";";
		}
		else
		{
			return this.theVariable.toString() + ";";
		}
	}
}
