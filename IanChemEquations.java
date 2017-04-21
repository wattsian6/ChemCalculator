public class ChemEquations
{
	public static final double R =  .00000000000000000218
	public static final double H = 6.62607004 * 10^-(34)
	public Double equation1( Double i, Double f, Double e)
	{
		int count = 0;
		Double answer = 0;
		if( e == null)
		{
			answer = R * ((1/i^2) - (1/f^2));
			count++;
		}
		if (i == null)
		{
			answer = (e/r) + (1/f^2);
			answer = (1 / answer);
			answer = Math.sqrt(answer);
			count++;
		}
		if (f == null)
		{
			answer = (1/i^2) - (e/r);
			answer = (1 / answer);
			answer = Math.sqrt(answer);
			count++;
		}
		if (count > 1)
		{
			System.out.println("Invalid Input");
			return null;
		}
		return answer;	
	}

	public Double equation2(Double e, Double n)
	{
		int count = 0;
		Double answer = 0
		if (e == null)
		{
			answer = (1 / (n^2)) * (-1 *R);
			count++;
		}
		if (n == null)
		{
			answer = r/e;
			answer = Math.sqrt(answer);
			count++;
		}
		if (count > 1)
		{
			System.out.println("Invalid Input");
			return null;
		}
		return answer;
	}
}

