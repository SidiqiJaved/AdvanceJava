package com.syntax.class05.SDET.Class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {

        String path="Files/facebook.properties";

        FileInputStream fileInputStream = new FileInputStream(path);

        Properties fb = new Properties();
        fb.load(fileInputStream);
        System.out.println(fb.getProperty("Browser") );
        System.out.println(fb.getProperty("url") );
        System.out.println(fb.getProperty("username") );
        System.out.println( fb.getProperty("password") );


    }

}
