package com.all;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import cucumber.runtime.snippets.Snippet;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="com.all",dryRun=false,monochrome=false,strict=false,tags="@Sanity",plugin= {"pretty","html:target","json:target\\Report\\file.json",
		"junit:target\\Report\\adctauto.xml"},snippets=SnippetType.CAMELCASE)
public class TestRunner {

	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Report\\file.json");
	}
}
