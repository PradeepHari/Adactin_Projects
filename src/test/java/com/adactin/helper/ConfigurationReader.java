package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	Properties p = new Properties();

	public ConfigurationReader() throws Throwable {
		File f = new File(
				"C:\\Users\\MR.PRADEEP\\eclipse-workspace\\MavenProject\\src\\test\\java\\com\\cucumber\\properties\\adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);

	}

	public String getbrowser() {
		String dbrowser = p.getProperty("browser");
		return dbrowser;

	}

	public String geturl() {
		String durl = p.getProperty("url");
		return durl;

	}

	public String getUserName() {
		String dusername = p.getProperty("db_username");
		return dusername;
	}

	public String getPassword() {
		String dpassword = p.getProperty("db_password");
		return dpassword;
	}

}
