package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;

public class Properties {
	public static void main(String[] args) {
		try {
			File file = new File("D:/Automation/src/test/resources/env.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			Enumeration enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				System.out.println(key + ": " + value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	private Enumeration keys() {
		// TODO Auto-generated method stub
		return null;
	}

	private void load(FileInputStream fileInput) {
		// TODO Auto-generated method stub
		
	}
}
