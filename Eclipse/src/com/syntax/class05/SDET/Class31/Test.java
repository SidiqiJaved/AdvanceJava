package com.syntax.class05.SDET.Class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {


        String path="/Users/javedsidiqi/Documents/Sheets/Sheet1.xlsx";


        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        Row row = sheet.getRow(1);
        System.out.println(row.getCell(0) );


    }

}
