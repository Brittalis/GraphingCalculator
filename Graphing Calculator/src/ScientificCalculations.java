
public class ScientificCalculations
{
	static String operationType;
	static double par1;
	static double par2;

	public static void main(String[] args)
	{
		// Here we will choose (based on the parameters) which method to call

		switch (operationType)
		{
		case "sin":sin();
		break;
		case "cos":cos();
		break;
		case "tan":tan();
		break;
		
		}

	}

	// first variable
	// operation
	// second variable
	// answer
	// answer become first variable and repeat

	static public double sin()
	{
		return Math.sin(par1);

	}

	static public double cos()
	{
		return Math.cos(par1);

	}

	static public double tan()
	{
		return Math.tan(par1);

	}

	static 	public double ln()
	{
		return Math.log(par1);

	}

	static public double log()
	{
		return Math.log10(par1);

	}

	static public double factorial()
	{
		return 0;

	}

	static public double power()
	{
		return Math.pow(par1, par2);

	}

	static public double sqaureRoot()
	{
		return Math.sqrt(par1);

	}

	static 	public double add()
	{
		return (par1 + par2);

	}

	static public double subtract()
	{
		return (par1 - par2);

	}

	static public double divide()
	{
		return (par1 / par2);

	}

	static 	public double multiply()
	{
		return (par1 * par2);

	}

	static 	public double inverseSin()
	{
		return Math.asin(par1);

	}

	static public double inverseCos()
	{
		return Math.acos(par1);

	}

	static public double inverseTan()
	{
		return Math.atan(par1);

	}

	static public double tenToTheX()
	{
		return Math.pow(10, par1);

	}

	static public double eToTheX()
	{
		return Math.pow(Math.E, par1);

	}

	static public double sqaured()
	{
		return Math.pow(par1, 2);

	}

}
