import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Read{
    protected static Logger logger = Logger.getLogger("C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\MavenBuildFib\\LogDemo\\ProgramDataJenkins.jenkinsworkspaceMavenBuildFibLogDemo");

    public static void readFromLog() {
        try {
            Scanner s = new Scanner(new File("C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\MavenBuildFib\\LogDemo\\ProgramDataJenkins.jenkinsworkspaceMavenBuildFibLogDemo"));
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
