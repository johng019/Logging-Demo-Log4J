
/**
 * Entry point for the application
 * that will write data to a log file,
 * before reading back selected data
 * logs from that file
 */

public class Main {

    public static void main(String[] args) {
        Read r = new Read();
        Write w = new Write();

        w.writeToLog(0);
        w.logger.info("Log Created \n.......................................");
        r.readFromLog();

    }
}
