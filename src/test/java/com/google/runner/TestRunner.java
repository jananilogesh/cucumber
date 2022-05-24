package com.google.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\loginpage.feature",
glue = "com\\google\\stepdef",monochrome=true,dryRun=false)

public class TestRunner {

}
