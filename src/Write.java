import java.io.IOException;
import java.text.DecimalFormat;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class Write{

    protected static Logger logger = Logger.getLogger("C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\MavenBuildFib\\LogDemo\\ProgramDataJenkins.jenkinsworkspaceMavenBuildFibLogDemo");

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
