public class Driver 
{
	public static void main(String[] args)
	{
		Parser p = new Parser("    apple   = a - c;");
		Parser p1 = new Parser("    apple   = (a * b) - c;");
		Parser p2 = new Parser("    a = b - c;");
		Parser p3 = new Parser("a = ((a+k) * (a + (b/n))) - c;");
		
		p.parse();
	}
}
