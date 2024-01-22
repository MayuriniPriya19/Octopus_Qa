package Utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel 
{

    public static String readExcelValue(int row, int col, String filepath, String sheetName) {

     try (FileInputStream fis = new FileInputStream(filepath);
         Workbook workbook = new XSSFWorkbook(fis)) {
    	Sheet sheet = workbook.getSheet(sheetName);
        Row excelRow = sheet.getRow(row);
        Cell cell = excelRow.getCell(col);
        return cell.toString();

    } catch (IOException e) {
        e.printStackTrace();
        return null;
    }

}
}

