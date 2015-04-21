public class Parser 
{
	private String theStmt;
	private int pos; //where am I in the statement string?
	
	public Parser(String theStmt)
	{
		this.theStmt = theStmt;
		this.pos = 0;
	}
	
	void parse()
	{
		this.parse_stmt();
	}
	
	private void parse_stmt()
	{
		System.out.println("hello");
		//Print each time it reads something like:
		//Read: VarName = a
		//Reading: Math-Exprsds
		
		//read a var name
		//read a math_expr
	}
	
	private void parse_math_expr()
	{
		//Display
		//Reading Left:
		//Read OP = *
		//Reading Right:
		
		//read left
		//read op
		//read right
	}
}
