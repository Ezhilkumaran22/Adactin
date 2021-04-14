package com.all;

import java.io.IOException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base {
	
	@Before("@sanity")
	public void beforeSanity() {
		System.out.println("sanity starts.....");
	}
	@After("@sanity")
	public void afterSanity() {
		System.out.println(".....after sanity");
	}
	@Before("regression")
	public void beforeRegression() {
		System.out.println("regression starts.....");
	}
	@After("@sanity")
	public void afterRegression() {
		System.out.println(".....after regression");
	}
	
	@Before
	public void start() {
		launchBrowser();
		System.out.println("Scenario start");
	}
	@After
	public void end(Scenario s) throws IOException {
		String name = s.getName();
		String replace = name.replace(" ", "_");
		screenShot(replace);
		toQuit();
	}
}
