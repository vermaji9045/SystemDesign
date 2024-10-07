public class LogError extends LogProcessor {
    public LogError(LogProcessor nextprocessor) {
        super(nextprocessor);
    }

    @Override
    public void log(int loglevel, String message) {
        if (loglevel == ERROR) {
            System.out.println(message);
        } else {
            super.log(loglevel, message);
        }
    }
}
