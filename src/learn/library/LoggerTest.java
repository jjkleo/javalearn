package learn.library;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

    public static void main(String[] args) throws Exception{

        var logger=System.getLogger("jkovac");
        Logger.getLogger("jkovac").setLevel(Level.SEVERE);
        Logger.getLogger("jkovac").addHandler(new FileHandler("a.xml"));
        logger.log(System.Logger.Level.DEBUG,"debug信息");
        logger.log(System.Logger.Level.INFO,"info信息");
        logger.log(System.Logger.Level.ERROR,"error信息");
    }
}
