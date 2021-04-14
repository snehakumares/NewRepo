package mylearningphase1.logging;

import org.junit.Test;

public class LoggingTestClass {
    @Test
    public void textCheck(){
        LoggingClass a = new LoggingClass();
        a.check("abc");
    }
}
