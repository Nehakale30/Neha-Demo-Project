package TestNGTutorial;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImpl implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I executed Listeners successfully." + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed execution result of Listeners."+result.getName());
    }
}
