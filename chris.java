public class Equations {
    /*
     *  Ideal Gas Equation
     *  PV = nRT
     */
    public Double idealGasEqu(Double p, Double v, Double n, Double t)
    {
        int flag = 0;
        int fcounter = 0;
        Double r = 0.08206;
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
        if(t == null)
        {
            fcounter++;
            flag = 5;
        }
        if(fcounter != 1)
        {
            System.out.println("Invalid. 1 variable should be left empty.");
            return -999.;
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
                default:
                    return r * n / (p * v);
            }
        }
    }
    /*
     *  Potential energy
     *  V = k * q1 * q2 / r
     */
    public Double potentialEnergy(Double q1, Double q2, Double r, Double v)
    {
        int flag = 0;
        int fcounter = 0;
        Double k = 8987551787.3681764;
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
            return -999.;
        }
        else
        {
            switch(flag) {
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
    public Double molarity(Double m, Double s, Double M)
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
            return -999.;
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
    public static void main(String[] args)
    {
        Equations s = new Equations();
        System.out.println(s.molarity(12.2, 1.3, null));
        System.out.println(s.molarity(12.2, null, 1.3));
        System.out.println(s.molarity(null, 12.2, 1.3));

    }
}
