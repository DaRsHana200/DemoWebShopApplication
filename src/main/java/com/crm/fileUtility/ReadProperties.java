package com.crm.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
			
	
	public static String property(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./src/main/resources/Configure/LoginProperties");
		prop.load(fis);
		String data = prop.getProperty(key);
		
		return data;
	}

}
