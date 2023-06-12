package resusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData {

    public static String fetchData(String sheetName, int row , int column) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/TestDataSheet.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
       String value= sheet.getRow(row).getCell(column).getStringCellValue();
       return value;


    }
}
