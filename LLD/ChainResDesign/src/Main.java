public class Main {
    public static void main(String[] args) {

        LogProcessor logProcessor=new LogInfo(new LogDebug(new LogError(null)));

        logProcessor.log(LogProcessor.INFO,"This is a debug message");
        logProcessor.log(LogProcessor.DEBUG,"This is a error message");
        logProcessor.log( LogProcessor.ERROR,"This is a info message");
    }
}