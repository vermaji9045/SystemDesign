public abstract class LogProcessor {

public static  int INFO=1;
public static  int DEBUG=2;
public static int ERROR=3;

LogProcessor nextprocessor;

    public LogProcessor(LogProcessor nextprocessor) {
        this.nextprocessor = nextprocessor;
    }

    public void log(int loglevel,String message)
    {
        if (nextprocessor!=null)
        {
            nextprocessor.log(loglevel, message);
        }
    }
}
