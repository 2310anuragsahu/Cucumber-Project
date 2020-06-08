package Cucumber.Demo;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\resources\\Cucumber\\Demo\\Features" }, 
		glue = { "Stepdefs" }, 
		plugin = { "pretty", "html:target/Cucumber-Reports", 
				"json:target/Cucumber-Reports/cucumber.json",
				"junit:target/Cucumber-Reports/cucumber.xml" },
		tags = "@main", 
		monochrome = true, 
		dryRun = false, 
		strict = false)

public class RunCucumberTest /* extends AbstractTestNGCucumberTests */ {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "features")
	public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
		testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}
}
