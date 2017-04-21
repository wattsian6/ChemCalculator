/* Bryce Cloniger
 *
 * Some Simple Chem Equations
 *
 */
public class Equations {

	public static Double boylesPandV(Double p1, Double v1, Double p2, Double v2) {
		int counter = 0;

		int flag = 0;

		if (p1 == null) {
			counter++;
			flag = 1;
		}
		if (p2 == null) {
			counter++;
			flag = 2;
		}
		if (v1 == null) {
			counter++;
			flag = 3;
		}
		if (v2 == null) {

			counter++;
		}

		if (counter != 1) {
			System.out.println("Invalid input");
			return null;
		}

		else {
			switch (flag) {
			case 1:
				return ((p2 * v2) / p2);
			case 2:
				return ((p2 * v2) / p1);
			case 3:
				return ((p1 * v1) / v2);
			default:
				return ((p1 * v1) / p2);

			}
		}
	}

	public static Double percentYield(Double theory, Double actual,
			Double percent) {
		int counter = 0;
		int flag = 0;

		if (theory == null) {
			counter++;
			flag = 1;
		}
		if (actual == null) {
			counter++;
			flag = 2;
		}
		if (percent == null) {

			counter++;
		}

		if (counter != 1) {
			System.out.println("Invalid input");
			return null;
		}

		else {
			switch (flag) {
			case 1:
				return ((actual / percent) * 100);
			case 2:
				return ((percent / 100) * theory);
			default:
				return ((actual / theory) * 100);

			}

		}
	}

	public static Double toKe(Double fa, Double ce) {
		if (fa == null && ce == null) {
			System.out.println("Invalid Input");
			return null;
		}
		if (fa == null) {
			return ce + 273.15;
		}
		if (ce == null) {
			return ((fa - 32) * (5.0 / 9.0)) + 273.15;
		}
		return null;
	}

	public static Double toFa(Double ce, Double ke) {
		if (ke == null && ce == null) {
			System.out.println("Invalid Input");
			return null;
		}
		if (ke == null) {
			return (ce * (9.0 / 5.0)) + 32;
		}
		if (ce == null) {
			return ((ke - 273.15) / (5.0 / 9.0)) + 32;
		}
		return null;
	}

	public static Double toCe(Double fa, Double ke) {
		if (fa == null && ke == null) {
			System.out.println("Invalid Input");
			return null;
		}
		if (fa == null) {
			return ke - 273.15;
		}
		if (ke == null) {
			return (fa - 32) * (5.0 / 9.0);
		}
		return null;
	}

	public static final double R = .00000000000000000218;
	public static final double H = 6.62607004 * Math.pow(10, -34);

	public Double equation1(Double i, Double f, Double e) {
		int count = 0;
		Double answer = 0.0;
		if (e == null) {
			answer = R * ((1 / (i * i)) - (1 / (f * f)));
			count++;
		}
		if (i == null) {
			answer = (e / R) + (1 / (f * f));
			answer = (1 / answer);
			answer = Math.sqrt(answer);
			count++;
		}
		if (f == null) {
			answer = (1 / (i * i)) - (e / R);
			answer = (1 / answer);
			answer = Math.sqrt(answer);
			count++;
		}
		if (count > 1) {
			System.out.println("Invalid Input");
			return null;
		}
		return answer;
	}

	public Double equation2(Double e, Double n) {
		int count = 0;
		Double answer = 0.0;
		if (e == null) {
			answer = (1 / (n * n)) * (-1 * R);
			count++;
		}
		if (n == null) {
			answer = R / e;
			answer = Math.sqrt(answer);
			count++;
		}
		if (count > 1) {
			System.out.println("Invalid Input");
			return null;
		}
		return answer;
	}

	/*
	 * Ideal Gas Equation PV = nRT
	 */
	public Double idealGasEqu(Double p, Double v, Double n, Double t) {
		int flag = 0;
		int fcounter = 0;
		Double r = 0.08206;
		if (p == null) {
			fcounter++;
			flag = 1;
		}
		if (v == null) {
			fcounter++;
			flag = 2;
		}
		if (n == null) {
			fcounter++;
			flag = 3;
		}
		if (t == null) {
			fcounter++;
			flag = 5;
		}
		if (fcounter != 1) {
			System.out.println("Invalid. 1 variable should be left empty.");
			return -999.;
		} else {
			switch (flag) {
			case 1:
				return n * r * t / v;
			case 2:
				return n * r * t / p;
			case 3:
				return r * t / (p * v);
			default:
				return r * n / (p * v);
			}
		}
	}

	/*
	 * Potential energy V = k * q1 * q2 / r
	 */
	public Double potentialEnergy(Double q1, Double q2, Double r, Double v) {
		int flag = 0;
		int fcounter = 0;
		Double k = 8987551787.3681764;
		if (q1 == null) {
			fcounter++;
			flag = 2;
		}
		if (q2 == null) {
			fcounter++;
			flag = 3;
		}
		if (r == null) {
			fcounter++;
			flag = 4;
		}
		if (v == null) {
			fcounter++;
			flag = 5;
		}
		if (fcounter != 1) {
			System.out.println("Invalid. 1 variable should be left empty.");
			return -999.;
		} else {
			switch (flag) {
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
	 * Molarity equation molarity = moles of solute / liters of solution
	 */
	public Double molarity(Double m, Double s, Double M) {
		int flag = 0;
		int fcounter = 0;
		if (m == null) {
			fcounter++;
			flag = 1;
		}
		if (s == null) {
			fcounter++;
			flag = 2;
		}
		if (M == null) {
			fcounter++;
			flag = 3;
		}
		if (fcounter != 1) {
			System.out.println("Invalid. 1 variable should be left empty.");
			return -999.;
		} else {
			switch (flag) {
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
