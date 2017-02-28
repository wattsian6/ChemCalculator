public class SigFigs
{
    public static void main (String[]args)
    {
         toSigFigs(4.957, 3);
       // System.out.println(a);
    }

    public static void toSigFigs(double num, int figs)
    {
        String nums = String.valueOf(num);
        double number = num; 
        int key = figs - 1;
        double carry = 0.000000000000000000;

        if (nums.contains("."))
        key +=1;
       
      //  else
    //        return i2.0;

        if (nums.charAt(key) > 4 && nums.charAt(key) !='9')
        {
            int old = Character.getNumericValue(nums.charAt(key));
            int newer = old + 1;
            char digit = (char)(newer + '0');

       //     System.out.println(digit);
            
            StringBuilder  finite = new StringBuilder(nums);
            finite.setCharAt(key, digit);

            String finalFinite = finite.substring(0, Math.min(finite.length(), key + 1));
    
            System.out.println(finalFinite);

       //     return 1.00;
        }

        else
        {
         //   return 0.00;
        }
    }

}
