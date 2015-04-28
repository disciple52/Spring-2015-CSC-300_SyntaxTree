
public class MathExpression extends Expression
{
	private Expression leftOperand;
	private Expression rightOperand;
	private char operator;
	
	public MathExpression(Expression leftOperand, Expression rightOperand, char operator)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operator;
	}
}
