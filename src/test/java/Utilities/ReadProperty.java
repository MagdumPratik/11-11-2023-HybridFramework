package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	Properties pr;
	public ReadProperty()
	{
		try
		{
		File src=new File(".//Confiration//Config.properties");
		FileInputStream fis=new FileInputStream(src);
		pr=new Properties();
		pr.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("File not found......");
		}
	}
	public String getApplicationUrl()
	{
		return pr.getProperty("base_url");
		
	}
	
	public String getUsername()
	{
		return pr.getProperty("username");
		
	}
	
	public String getPassword()
	{
		return pr.getProperty("password");
		
	}
}
