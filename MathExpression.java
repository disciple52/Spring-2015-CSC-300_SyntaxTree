public class MathExpression extends Expression
{
	private Expression leftOperand;
	private Expression rightOperand;
	private OpExpression operator;
	
	public MathExpression(Expression leftOperand, Expression rightOperand, OpExpression operator)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operator;
	}
	
	public String toString()
	{	String result = "";
		if(this.leftOperand instanceof MathExpression)
		{
				result += "(" + this.leftOperand.toString() + ")";
		}
		else
		{
			result += this.leftOperand.toString();
		}
		result += this.operator.toString();
		if(this.rightOperand instanceof MathExpression)
		{
				result += "(" + this.rightOperand.toString() + ")";
		}
		else
		{
			result += this.rightOperand.toString();
		}
		return result;
	}
}