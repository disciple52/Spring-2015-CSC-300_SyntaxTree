public class Driver 
{
	public static void main(String[] args)
	{
		Parser p1 = new Parser("    apple   = (a * b) - c;");
		Parser p2 = new Parser("    apple = 20 - 15;");
		Parser p3 = new Parser("a = ((a+k) * (a + (b/n))) - c;");
		
		Parser p = new Parser("a=5;     apple =     (a *   7) - 3;");
		p2.parse();
		VarDefStatement vds = p2.getTheSyntaxTree();
		System.out.println(vds);
		
		/*We need to be able to handle a new kind of statement.
		 * A var def statement can now handle having a literal on
		 * the right instead of just a math expression. When this 
		 * occurs, that variable/lit-value pair needs to be stored 
		 * somewhere so we can look it up later when we doMath. You
		 * might choose to create a VariableEnv object that 
		 * holds an array of Variable objects, where a Variable object
		 * holds a variable name and an integer value. 
		 * 
		 * The VariableEnv 
		 * should allow us to add variables to it, and retrieve the 
		 * value given a variable name. Then finish doMath to support 
		 * variable. Note that your parser must now be able to parse
		 * multiple statements in a row. (ie things separated by;)
		 */
	}
}
