Public class Equations
{
	public double boylesPandV( double p1, double p2, double v1, double v2)
	{
		int counter = 0;
		int flag;
		
		if (p1 == null)
		{
		counter++;
		flag = 1;	
		}
		if (p2 == null)
		{
		counter++;
		flag = 2;	
		}
		if (v1 == null)
		{
		counter++;
		flag = 3;	
		}
		if (v2 == null)
		{
		counter++;	
		}
		
		if(counter != 1)
		{
			System.out.println("Invalid input");
		}
		
		else
		{
			switch(flag)
			{
				case 1:
					return ((p2 * v2)/p2);
				case 2:
					return ((p2 * v2)/p1);
				case 3:
					return ((p1 * v1)/v2);
			
				default:
					return ((p1 * v1)/p2);
			}
		}
	}
	
	public double percentYield(double theory, double actual, double percent)
	{
		int counter = 0;
		int flag;
		
		if (theory == null)
		{
		counter++;
		flag = 1;	
		}
		if (actual == null)
		{
		counter++;
		flag = 2;	
		}
		if (percent == null)
		{
		counter++;	
		}
		
		
		if(counter != 1)
		{
			System.out.println("Invalid input");
		}
		
		else
		{
			switch(flag)
			{
				case 1:
					return ((actual/percent)*100);
				case 2:
					return ((percent/100)*theory);
				default:
					return ((actual/theory)*100);
			}
		}
	}
	}
	
	
	
	
	
	
	
	
}