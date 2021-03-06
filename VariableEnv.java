//should allow us to add variables to it, and retrieve the value given a variable name
public class VariableEnv 
{
	private Variable[] variableArray;
	
	
	public VariableEnv()
	{
		this.variableArray = null;		
	}

	public void addVariable(Variable v)
	{
		if(this.variableArray == null)
		{
			this.variableArray = new Variable[1];
			this.variableArray[0] = v;
		}
		else
		{
			Variable[] temp = new Variable[this.variableArray.length+1];
			for(int i = 0; i < this.variableArray.length; i++)
			{
				temp[i] = this.variableArray[i];
			}
			temp[temp.length-1] = v;
			this.variableArray = temp;
		}
	}
	
	public int resolve(String name) //returns the value associated with this variable name
	{
		//"for each loop"
		for(Variable v : this.variableArray)
		{
			if(v.getVarName().equals(name))
			{
				return v.getNumValue();
			}
		}
		return -1; //we should never get here
	}
	
		/* same thing as "for each loop"
		Variable v;
		for(int i = 0; i < this.variableArray.length; i++)
		{
			{
				if(v.getVarName().equals(name))
				{
					return v.getNumValue();
				}
			}
			return -1; //we should never get here
		}
		*/
}