
public class Equations {
    /*
	 *  Ideal Gas Equation
	 *  PV = nRT
	 */
	public double idealGasEqu(double p, double v, double n, double r, double t)
	{
	    int flag = 0;
		int fcounter = 0;
	    if(p == null)
		{
		    fcounter++;
		    flag = 1;
		}
		if(v == null)
		{
		    fcounter++;
		    flag = 2;
		}
		if(n == null)
		{
			fcounter++;
		    flag = 3;
		}
		if(r == null)
		{
			fcounter++;
		    flag = 4;
		}
		if(t == null)
		{
			fcounter++;
		    flag = 5;
		}
		if(fcounter != 1)
		{
		    System.out.println("Invalid. 1 variable should be left empty.");
		}
		else
		{
			switch(flag) {
				case 1:
					return n * r * t / v;
				case 2:
					return n * r * t / p;
				case 3:
					return r * t / (p * v);
				case 4:
					return n * t / (p * v);
				default:
					return r * n / (p * v);
			}
		}
	}
	/*
	 *  Potential energy
	 *  V = k * q1 * q2 / r
	 */
	public double potentialEnergy(double k, double q1, double q2, double r, double v)
	{
	    int flag = 0;
		int fcounter = 0;
	    if(k == null)
		{
		    fcounter++;
		    flag = 1;
		}
		if(q1 == null)
		{
		    fcounter++;
		    flag = 2;
		}
		if(q2 == null)
		{
			fcounter++;
		    flag = 3;
		}
		if(r == null)
		{
			fcounter++;
		    flag = 4;
		}
		if(v == null)
		{
			fcounter++;
		    flag = 5;
		}
		if(fcounter != 1)
		{
		    System.out.println("Invalid. 1 variable should be left empty.");
		}
		else
		{
			switch(flag) {
				case 1:
					return r * v / (q1 * q2);
				case 2:
					return r * v / (k * q2);
				case 3:
					return r * v / (q1 * k);
				case 4:	
					return k * q1 * q2 / v;
				default:
					return k * q1 * q2 / r;
			}
		}
	}
	/*
	 *  Molarity equation
	 *  molarity = moles of solute / liters of solution
	 */
	public double molarity(double m, double s, double M)
	{
	    int flag = 0;
		int fcounter = 0;
	    if(m == null)
		{
		    fcounter++;
		    flag = 1;
		}
		if(s == null)
		{
		    fcounter++;
		    flag = 2;
		}
		if(M == null)
		{
		    fcounter++;
		    flag = 3;
		}
		if(fcounter != 1)
		{
		    System.out.println("Invalid. 1 variable should be left empty.");
		}
		else
		{
			switch(flag) {
				case 1:
					return M * s;
				case 2:
					return m / M;
				default:
					return m / s;
			}
		}
	}
}