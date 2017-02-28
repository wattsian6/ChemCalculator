/**
*   Bryce Cloniger, 2/28/17
*
*   An UNFINISHED sigfig calculator. See comment on main page for restrictions.
*
**/

public class SigFigs
{
    public static void main (String[]args)
    {
         toSigFigs(4.957, 3);
      
    }

    public static void toSigFigs(double num, int figs)
    {
        String nums = String.valueOf(num);
        double number = num; 
        int key = figs - 1;
      

        if (nums.contains("."))
        key +=1;
       
   

        if (nums.charAt(key) > 4 && nums.charAt(key) !='9')
        {
            int old = Character.getNumericValue(nums.charAt(key));
            int newer = old + 1;
            char digit = (char)(newer + '0');

     
            
            StringBuilder  finite = new StringBuilder(nums);
            finite.setCharAt(key, digit);

            String finalFinite = finite.substring(0, Math.min(finite.length(), key + 1));
    
            System.out.println(finalFinite);

    
        }

        else
        {
            System.out.println("Currently Invalid Operation");
        }
    }

}
