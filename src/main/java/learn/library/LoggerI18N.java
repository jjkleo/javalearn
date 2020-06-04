package learn.library;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerI18N {
    public static void main(String[] args) throws Exception{
        var rb= ResourceBundle.getBundle("logMess", Locale.getDefault(Locale.Category.FORMAT));
        var logger=System.getLogger("jkovac",rb);
        Logger.getLogger("jkovac").setLevel(Level.ALL);
        Logger.getLogger("jkovac").addHandler(new FileHandler("a.xml"));
        logger.log(System.Logger.Level.DEBUG,"debug");
        logger.log(System.Logger.Level.INFO,"info");
        logger.log(System.Logger.Level.ERROR,"error");
    }
}
