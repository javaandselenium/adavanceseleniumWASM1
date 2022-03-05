package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Sample implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("testcase is strated",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("testcase is success",true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("testcase is failure",true);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("testcase is skipped",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("testcase is successpercentage",true);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("testcase is failed",true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("testcase is onstart",true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("testcase is onfinish",true);
	}

}
