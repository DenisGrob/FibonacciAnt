import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());
    static int number_of_values = 10;

    public static void main(String[] args) throws IOException, SQLException {
        log.debug("Hello this is a debug message");
        log.debug(Fibonacci.calculate(number_of_values));

    }
}
