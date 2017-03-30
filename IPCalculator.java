
/**
 *
 * @author NikhilPatel
 */

public class IPCalculator {
    
    final int Base_2=2;
    final int Base_10=10;
    final int Base_16=16;
    //^ This is for verifyBase
    public boolean verifyBase(String nbr, int base)
    {
        String hexDigit="abcdef";
        boolean rslt=true;
        switch(base)
        {
            case Base_2:
                for(int i=0; i<nbr.length();i++)
                {
                    if(!Character.isDigit(nbr.charAt(i)) || Integer.parseInt(String.valueOf(nbr.charAt(i)))>1)
                        rslt=false;
                    if(!rslt)break;
                }
                break;
            case Base_10:
                for(int i=0;i<nbr.length();i++)
                {
                    if(!Character.isDigit(nbr.charAt(i)))
                        rslt=false;
                    if(!rslt)break;
                }
            case Base_16:
                for(int i=0;i<nbr.length();i++)
                {
                    if(Character.isDigit(nbr.charAt(i)))
                        rslt=true;
                    else
                        if(!hexDigit.contains(String.valueOf(nbr.charAt(i))))
                            rslt=false;
                    if(!rslt)break;
                }  
        }//end switch
        //for(int i=0;i<nbr.length();i++)
            //System.out.println("Digit is "+ nbr.charAt(i)+"-- is valid Digit"+ Character.isDigit(nbr.charAt(i)));
        return rslt;
    }//end verify
    
    String binaryConv(String nbr, int base)
    {
        String number = nbr;
        if(base == Base_10){
            number=Long.toString(Long.parseLong(nbr,2));
        }
        if(base == Base_16){
            number=Long.toHexString(Long.parseLong(nbr));
        }
        return number;
    }//end binary
    
    String hexConv(String nbr, int base)
    {
       String number = nbr;
       if(base == Base_2){
           number=Long.toBinaryString(Long.parseLong(nbr,16));
       }
       if(base == Base_10){
           number=Long.toString(Long.parseLong(nbr,16));
       }
       return number;
    }//end hex
    
    String decimalConv(String nbr, int base)
    {
       String number = nbr;
       if(base == Base_2){
           number=Long.toBinaryString(Long.parseLong(nbr));
       }
       if(base == Base_16){
           number=Long.toHexString(Long.parseLong(nbr));
       }
       return number;
    }//end decimal
    
    
    
}//end class
    
