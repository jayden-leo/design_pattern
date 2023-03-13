package com.jayden.a2_structurer.a3_decorator.a2_FileEncrypt;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 具体组件,重写读写方法
 **/
public class BaseFileDataLoader implements DataLoader {

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }



    public String read() {
        try {
            String result = FileUtils.readFileToString(new File(filePath), "utf-8");
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void write(String data) {
        try{
            FileUtils.writeStringToFile(new File(filePath), data, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}