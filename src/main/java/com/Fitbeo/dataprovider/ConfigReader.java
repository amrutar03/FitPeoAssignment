package com.Fitbeo.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigReader {

	
	@Test
	public static String getProperty(String key)
	{
		 Properties pro=new Properties();
			try {
				pro.load(new FileInputStream(new File(".//config//config.properties")));
			} catch (FileNotFoundException e) {
				System.out.println("Could not find file ::"+e.getMessage());
				
			} catch (IOException e) {
				System.out.println("Could not find file ::"+e.getMessage());
				
			}
		String value= pro.getProperty(key);
		return value;
	}
}
