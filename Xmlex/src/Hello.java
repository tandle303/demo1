
import org.apache.log4j.Logger;  
import org.apache.log4j.xml.DOMConfigurator;  
  
public class Hello {  
  
    static Logger logger = Logger.getLogger(Hello.class);  
      
    public static void main(String[] args) {  
        DOMConfigurator.configure("C:\\Users\\akshaykumarpr.tandl\\eclipse-workspace\\Xmlex\\log4j.xml");  
        logger.debug("Sample debug message");  
        logger.info("Sample info message");  
        logger.warn("Sample warn message");  
        logger.error("Sample error message");  
        logger.fatal("Sample fatal message");  
    }  
}  
