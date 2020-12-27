package com.adactin.helper;

public class FileReaderManager {

	public static FileReaderManager getInstance() {
		FileReaderManager helper = new FileReaderManager();
		return helper;

	}

	public ConfigurationReader getInstancereader() throws Throwable {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;
	}
}
