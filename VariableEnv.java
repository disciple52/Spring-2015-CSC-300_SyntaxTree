public class VariableEnv 
{
	private Variable[] variableArray;
	
	
	public VariableEnv(int count)
	{
		this.variableArray = new Variable[count];
	}

	public Variable[] getVariableArray() {
		return variableArray;
	}
	
	public void add(Variable theVariable)
	{
		variableArray.add(theVariable);
	}
	//should allow us to add variables to it, and retrieve the value given a variable name
}