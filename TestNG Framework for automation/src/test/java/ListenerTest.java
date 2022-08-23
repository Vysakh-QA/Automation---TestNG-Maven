import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// TODO Auto-generated method stub

		
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");


		    Date date = new Date() ;
		    
		 TakesScreenshot  takeScr = (TakesScreenshot)DriverUtil.driver;
	     File srcFile = takeScr.getScreenshotAs(OutputType.FILE);
		String userHomeDir = System.getProperty("user.home");

		try {
	     FileUtils.copyFile(srcFile, new File(
	    		 "Failed Screenshot/"
	    			+formatter2.format(date).toString().replace("/", "-")+"/"
	    			+formatter.format(date).toString().replace("/", "-")+".png"));
	  } 
	     catch (IOException e) {
	     e.printStackTrace();
	  }
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
