package com.guru99.qa.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.guru99.qa.base.TestBase;


public class CommonUtilities extends TestBase{
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\shalu.singh\\eclipse-workspace\\Guru99Test\\src\\main\\java\\com\\guru99\\qa\\testdata\\TestData.xlsx";



	static Workbook book;

	static Sheet sheet;

	static JavascriptExecutor js;

//	public static void takeScreenshotAtEndOfTest() throws IOException {
//
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		String currentDir = System.getProperty("user.dir");
//
//		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//
//	}

	public static Object[][] getTestData(String sheetName) {

		FileInputStream file = null;

		try {

			file = new FileInputStream(TESTDATA_SHEET_PATH);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		try {

			book = WorkbookFactory.create(file);

		} catch (InvalidFormatException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

		sheet = book.getSheet(sheetName);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		// System.out.println(sheet.getLastRowNum() + "--------" +

		// sheet.getRow(0).getLastCellNum());

		for (int i = 0; i < sheet.getLastRowNum(); i++) {

			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {

				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();

				// System.out.println(data[i][k]);

			}

		}

		return data;

	}
	
	
}