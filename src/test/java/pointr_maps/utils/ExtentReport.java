package pointr_maps.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReport {
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void createReport(){
        String path = System.getProperty("user.dir") + File.separator + "reports" + File.separator + "report.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("PointrMaps App Report");
        reporter.config().setDocumentTitle("PointrMaps Report");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Erol Isildak");
    }

    public static void createTest(String testName){
        test = extent.createTest(testName);
    }

    public static void info(String info){
        test.info(info);
    }

    public static void saveReport(){
        extent.flush();
    }
}
