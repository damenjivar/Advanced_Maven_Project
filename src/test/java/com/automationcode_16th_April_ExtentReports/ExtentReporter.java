package com.automationcode_16th_April_ExtentReports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	public static ExtentReports generateExtentReport() throws IOException {

		// 1. make sure the dependency of extentreports is inside pom.xml file

		// 2. create the object of ExtentReports class
		ExtentReports extentReport = new ExtentReports();

		// 3. create the object of File Class and pass the path of the .html file in the
		// constructor.
		File extentReportFile = new File(
				System.getProperty("user.dir") + "\\test-output\\ExtentReports\\extentreport.html");

		// 4. create the object of ExtentSparkReporter class and pass the File reference
		// in the Constructor.
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);

		// 5. using the sparkReporter, we can configure a lot of things
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("TN Automation Results");
		sparkReporter.config().setDocumentTitle("TNReportTitle|Automation|Results");
		sparkReporter.config().setTimeStampFormat("dd/mm/yyyy hh:mm:ss");

		// 6. we need to attach the ExtentReport with the SparkReporter
		extentReport.attachReporter(sparkReporter);

		// 7. additional information - system information and pass it in the Extent
		// reports.
		// 7.1 create a properties file and add necessary details in the properties file
		// 7.2 you have to write the code of how to read from the properties file here

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automationcode_16th_April_ExtentReports\\config.properties");
		prop.load(ip);

		// application url, browserName, username, password, operating system, java
		// version, name of the SDET

		extentReport.setSystemInfo("application url", prop.getProperty("url"));
		extentReport.setSystemInfo("browser name", prop.getProperty("browser"));
		extentReport.setSystemInfo("email", prop.getProperty("validUsername"));
		extentReport.setSystemInfo("password", prop.getProperty("validPassword"));
		extentReport.setSystemInfo("operating system", System.getProperty("os.name"));
		extentReport.setSystemInfo("operating system version", System.getProperty("os.version"));
		extentReport.setSystemInfo("SDET", System.getProperty("user.name"));
		extentReport.setSystemInfo("java version", System.getProperty("os.name"));
		extentReport.setSystemInfo("java vendor", System.getProperty("java.vendor"));

		// 8. return the extentReport
		return extentReport;

	}
}
