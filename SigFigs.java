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
         toSigFigs(0.0, 0); //Takes double input and desired sigfigs. (4.555, 3) will return 4.56
       
    }

    public static void toSigFigs(double num, int figs)
    {
        String nums = String.valueOf(num);      //cast double value to a String
        double number = num; 
        int key = figs - 1;                     //accounts for java's values starting at 0. Key is where the number will be "cut off"
     

        if (nums.contains("."))
        key +=1;                                //takes the radix into account
       


        if (nums.charAt(key+ 1) > 52 && nums.charAt(key) !='9')         //shows that rounding is needed
        {
            int old = Character.getNumericValue(nums.charAt(key));      //grab value needing to be rounded
            int newer = old + 1;                                        //increment it by one
            char digit = (char)(newer + '0');                           //cast it to a char
      
            StringBuilder  finite = new StringBuilder(nums);            //rebuild our string with the new rounded digit
            finite.setCharAt(key, digit);

            String finalFinite = finite.substring(0, Math.min(finite.length(), key + 1));   
    
            System.out.println(finalFinite);        //format our string to have a max # of chars (sig figs) and print
    

        }

          
        else if (nums.charAt(key+1) < 52 )              //shows no rounding needed
        {
           String finalFinite = nums.substring(0, Math.min(nums.length(), key + 1));    
           System.out.println(finalFinite);        //format our string to have a max # of chars (sig figs) and print
        }

        else
        {

        }

    }
}

