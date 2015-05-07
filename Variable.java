
public class Variable 
{
	private String varName;
	private int numValue;
	
	public Variable(String varName, int numValue)
	{
		this.varName = varName;
		this.numValue = numValue;
	}
	
	public String toString()
	{
		return varName + " = " + numValue + ";";
	}
	//Variable Example: apple = 5;
	//Variable = lit-value;

	public String getVarName() 
	{
		return varName;
	}

	public int getNumValue() 
	{
		return numValue;
	}
}
