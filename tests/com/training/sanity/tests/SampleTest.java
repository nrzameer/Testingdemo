package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.SamplePOM;

public class SampleTest extends LoginTests{

	SamplePOM sample;
	
	@Test
	public void te() {
		sample = new SamplePOM(driver);
		sample.getTtile();
	}
}
