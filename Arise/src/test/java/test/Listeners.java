package test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.Screenshot;

public class Listeners implements ITestListener {

    public void onTestStart(ITestResult result)
    {
        System.out.println("Test Started" +result.getName());
    }


    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test Success" +result.getName());

    }

    public void onTestSkipped(ITestResult result)
    {
        System.out.println("Test Skipped" +result.getName());
    }

    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test failed" +result.getName());





    }


}
