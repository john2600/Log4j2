package com.mycuteblog.log4j2;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyTest {
	@Test
    public void test() {
        final TestAppender appender = new TestAppender();
        final Logger logger = LogManager.getLogger(LogDemo.class.getName());
        logger.addAppender(appender);
        try {
        	LogDemo demo = new LogDemo();
        	demo.setDatos(1, 2);
            Logger.getLogger(LogDemo.class);
        }
        finally {
            logger.removeAppender(appender);
        }
        final List<LoggingEvent> log = appender.getLog();
        for(LoggingEvent login:log){
        	System.out.println(login.getMessage().toString());
        
        }
        final LoggingEvent firstLogEntry = log.get(0);
        
        assertThat(firstLogEntry.getLevel(), is(Level.INFO));
        assertThat((String) firstLogEntry.getMessage(), is("Test"));
       
    }

}
