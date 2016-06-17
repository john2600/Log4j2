package com.mycuteblog.log4j2;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.Appender;
import org.junit.Before;
import org.junit.Test;

public class LogDemoTest {
	Logger logger = (Logger) LogManager.getLogger(LogDemo.class.getName());
	private LogDemo demo;
	int result;
	int a,b = 0;
	
	//given
	@Before
	public void init(){
		demo = new LogDemo();
		a=4;
		b=10;
	}
	
	@Test
	public void suma(){
		// Appender mockAppender = new Appender("d");
		// mockAppender.start();
		
		// logger.addAppender(mockAppender);
		demo.setDatos(a, b);
		
		assertEquals(14,demo.getResultadoSuma());
	}
	

}
