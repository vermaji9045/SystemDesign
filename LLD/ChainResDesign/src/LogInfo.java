public class LogInfo  extends LogProcessor{

    public LogInfo(LogProcessor nextprocessor) {
        super(nextprocessor);
    }

    /**
     * Logs the given message with the given log level, if the log
     * level is INFO. Otherwise, delegates to the superclass.
     *
     * @param loglevel the log level to log at
     * @param message  the message to log
     */
    @Override
    public void log(int loglevel, String message) {
        if(loglevel==INFO)
        {
            System.out.println("INFO: "+message);
        }
        else
        {
           super.log(loglevel, message);
        }
    }
}
