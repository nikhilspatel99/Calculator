import java.util.Arrays;

/**
 *
 * @author NikhilPatel
 */
public class TestIPCalculator {
    
    public static void main (String args[])
    {
        String usrNbr="11010101";
        int base= 10;
        IPCalculator myCalculator= new IPCalculator();
        
        System.out.println(myCalculator.binaryConv(usrNbr, base));
        
             
    }//end main
    

      
}//end Test
