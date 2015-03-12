package org.jmpa.main;

import javax.faces.bean.ManagedBean;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
@ManagedBean
public class Clase1 {
	static final Logger log = LogManager.getLogger(Logger.class.getName());
	
	public void loggear_algo()
	{
		for(int i = 0; i<10;i++)
			log.debug("Ciclo: "+i);
	}
}