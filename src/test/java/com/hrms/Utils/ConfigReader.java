package com.hrms.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;
	public static void readProperties(String FilePath)
	{
		try {
			FileInputStream fis= new FileInputStream(FilePath);
			 prop= new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getproperty(String Key)
	{
		return prop.getProperty(Key);
		
	}
	
}
