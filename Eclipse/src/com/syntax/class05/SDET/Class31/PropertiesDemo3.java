package com.syntax.class05.SDET.Class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {

    public static void main(String[] args) throws IOException {


        String path ="/Users/javedsidiqi/Desktop/Code/Obama.properties";


        FileOutputStream fileOutputStream = new FileOutputStream(path);

    Properties properties = new Properties(  );
    properties.put("isCrazy", " False");
    properties.put("isRich", "true");
    properties.store(fileOutputStream, "Added some new fields and yes it works");




    }
}
