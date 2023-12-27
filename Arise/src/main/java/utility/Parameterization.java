package utility;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Parameterization {


    public static String getExcelData(int row, int cell) throws EncryptedDocumentException, IOException {
        FileInputStream file = new FileInputStream("/Users/ac02d77qnmd6m/Downloads/Arise/src/main/resources/Test_data.xlsx");
        String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();

        return value;

    }
    public static double getData(int rows, int cells) throws IOException {
        FileInputStream files = new FileInputStream("/Users/ac02d77qnmd6m/Downloads/Arise/src/main/resources/Test_data.xlsx");
        double cellValue = WorkbookFactory.create(files).getSheet("sheet2").getRow(rows).getCell(cells).getNumericCellValue();

        return cellValue;
    }
    public static boolean getParameters(int r, int c) throws IOException {
        FileInputStream files = new FileInputStream("/Users/ac02d77qnmd6m/Downloads/Arise/src/main/resources/Test_data.xlsx");
        boolean values = WorkbookFactory.create(files).getSheet("sheet3").getRow(r).getCell(c).getBooleanCellValue();
        System.out.println(values);
        return values;

    }
    public static void main(String[] args) {
        try {
            double data = getData(0, 0);
            System.out.println("Data: " + data);

        } catch (IOException e) {
            e.printStackTrace();

        }

        try {
            boolean rowValue = getParameters(0, 0);
            System.out.println("Retrieved Value: " + rowValue);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
