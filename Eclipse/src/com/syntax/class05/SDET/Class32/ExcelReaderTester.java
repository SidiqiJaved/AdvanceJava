package com.syntax.class05.SDET.Class32;

import com.syntax.class05.SDET.until.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException, IOException {
        String path="/Users/javedsidiqi/Desktop/Code/files/Book1.xlsx";
        List<Map<String,String>> excelData= ExcelReader.getData(path,"Sheet1");
        System.out.println(excelData.get(1).get("FirstName"));
        System.out.println(excelData.get(4).get("Age"));
    }
}

