package pointr_maps.utils;

import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import static pointr_maps.utils.ConfigReader.getProperty;
import static pointr_maps.utils.Driver.*;
import static pointr_maps.utils.ExtentReport.*;

public class Listener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        startServer(getProperty("localIPAdres"), Integer.parseInt(getProperty("localPort")));
        createReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
        createTest(result.getMethod().getMethodName());
        test.info("Test start.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test successfull.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Error message
        test.fail("Test unsuccessfull. Because: " + result.getThrowable().getMessage());

        // Screenshot
        File dosya = driver.getScreenshotAs(OutputType.FILE);
        String dosyaYolu = System.getProperty("user.dir") + File.separator + "reports" + File.separator + result.getMethod().getMethodName() + ".png";
        try {
            FileUtils.copyFile(dosya, new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Add screenshot to report
        try {
            test.addScreenCaptureFromPath(dosyaYolu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        closeApp();
    }

    @Override
    public void onFinish(ITestContext context) {
        closeApp();
        saveReport();
        closeServer();
    }
}























