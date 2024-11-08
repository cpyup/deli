package com.pluralsight.persistence;

import com.pluralsight.model.Order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager {
    private static final String filePath = "receipts/";
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");

    public void saveReceipt(Order order){
        // TODO
    }

    private String generateFileName(){
        return filePath + getCurrentDate() + ".txt";
    }

    private String getCurrentDate(){
        return LocalDateTime.now().format(dateFormat);
    }
}
