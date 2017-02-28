/* Bryce Cloniger
 *
 * Some Simple Chem Equations
 *
 */
public class Equations
{
    public static void main(String[]args)
    { 
       // System.out.println("hey");
      double a =  boylesPandV(10.8, 567.8, 679.8,null);
      System.out.println( a);

      double b = percentYield(16.8, 15.0, null);
      System.out.println(b);

      double c = toFa(null, 32.0);
      double d = toCe(null, 32.0);
      double e = toKe(null, 32.0);

      System.out.println(c + "\n" + d + "\n" + e + "\n");
    }


    public static Double boylesPandV( Double p1, Double v1, Double p2, Double v2)
    {
        int counter = 0;
       
        int flag=0;
        
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
           return null;
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
    
    public static Double percentYield(Double theory, Double actual, Double percent)
    {
        int counter = 0;
        int flag=0;
        
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
           return null;
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
        
        public static Double toKe(Double fa, Double ce)
        {
            if (fa == null && ce == null)
            {
                System.out.println("Invalid Input");
                return null;
            }
            if (fa == null)
            {
                return ce + 273.15;
            }
            if (ce == null)
            {
                return ((fa - 32) * (9.0/5.0)) + 273.15; 
            }
            return null;
        }
        
        public static Double toFa(Double ce, Double ke)
        {
            if (ke == null && ce == null)
            {
                System.out.println("Invalid Input");
                return null;
            }
            if (ke == null)
            {
                return (ce * (9.0/5.0)) + 32;
            }
            if (ce == null)
            {
                return ((ke - 273.15) / (5.0/9.0)) +32; 
            }
            return null;
        }
        
        public static Double toCe(Double fa, Double ke)
        {
            if (fa == null && ke == null)
            {
                System.out.println("Invalid Input");
                return null;
            }
            if (fa == null)
            {
                return ke - 273.15;
            }
            if (ke == null)
            {
                return (fa - 32) * (9.0/5.0); 
            }
            return null;
        }
        
    }
    
    
    
    
    

