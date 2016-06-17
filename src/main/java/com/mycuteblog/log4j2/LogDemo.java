package com.mycuteblog.log4j2;

import org.apache.log4j.*;


public class LogDemo {
	private static final Logger logger = LogManager.getLogger(LogDemo.class.getName());
	private int a;
	private int b;
	
	public void setDatos(int a, int b){
		logger.info("Valor 1 "+a);
		this.a = a;
		logger.info("Valor 2 "+b);
		this.b = b;
	}
	public int getResultadoSuma(){
		return this.a+this.b;
	}
	

}
