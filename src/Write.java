import java.text.DecimalFormat;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

/**
 * This class writes log data to a text file.
 * The data provided using a simple for loop
 * that takes the integers 0 thu 100 and
 * divides 100 by that number.
 *The returned value or exception is logged
 */

public class Write{

    protected static Logger logger = Logger.getLogger("myLog.txt");

    public void writeToLog(int a) {
        DecimalFormat df = new DecimalFormat("#.###");
        int i ;
        try {
            for (i = a; i <= 100; i++) {
                int j = 100 / i;
                logger.log(Level.INFO, "For i = " + i + " : j = " + df.format((double)100 / i ) +
                        "\n.......................................");
            }
        }
        catch(Exception e){
            logger.log(Level.FATAL, "Exception :  " + e +
                    "\n.............................................................");
            logger.log(Level.WARN, " Re-calling the Method " +
                    "\n ......................................");
            writeToLog(1);
        }
    }
}
