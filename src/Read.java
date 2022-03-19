import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * This class parses a log file for log
 * items with a level of SEVERE or WARNING
 */

public class Read{
    protected static Logger logger = Logger.getLogger("myLog.txt");

    public static void readFromLog() {
        try {
            Scanner s = new Scanner(new File("myLog.txt"));
            System.out.println("Parsing log for Fatal and WARNING level records");
            while (s.hasNextLine()) {
                String line = s.nextLine();
                    if(line.contains("WARN") || line.contains("FATAL")){
                        System.out.println(".............................................................");
                        System.out.println(line);
                        s.nextLine();
                        String dateStamp = s.nextLine();
                        System.out.println(dateStamp);
                    }
                }
            logger.getLevel();
            System.out.println(".............................................................");
            System.out.println("Log Parsed!");
            s.close();
        }
        catch (IOException ex) {
            System.out.println("No SEVERE or WARNING level records found");
        }
    }
}
