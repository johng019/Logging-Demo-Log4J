
public class Main {

    public static void main(String[] args) {
        Read r = new Read();
        Write w = new Write();

        w.writeToLog(0);
        w.logger.info("Log Created \n.......................................");
        r.readFromLog();

    }
}
