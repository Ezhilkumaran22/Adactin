package com.all;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jasonPath) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\Report\\JvmReport");
		Configuration c = new Configuration(f,"Adactin application");
		c.addClassifications("Platform name","window 10");
		c.addClassifications("Browser","Chrome");
		c.addClassifications("Browser Version","89.0");
		c.addClassifications("Sprint number","25");
		
		List<String> l = new ArrayList<String>();
		l.add(jasonPath);
		
		ReportBuilder r = new ReportBuilder(l,c);
		r.generateReports();
	}
}
