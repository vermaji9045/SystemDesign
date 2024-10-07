public class LogDebug extends LogProcessor {

    public LogDebug(LogProcessor nextprocessor) {
        super(nextprocessor);
    }
    public void log(int loglevel,String message)
    {
        if (loglevel==DEBUG)
        {
            System.out.println("DEBUG: "+message);
        }
        else
        {
           super.log(loglevel, message);
        }
    }
}
