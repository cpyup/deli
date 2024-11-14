package com.pluralsight.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager {
    private static final String filePath = "receipts/";
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");

    private FileManager() {}

    public static void saveReceipt(String orderString) {
        String newFilePath = generateFileName();

        if (!createNewFile(newFilePath)) {
            System.out.println("Error Creating File");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath))) {
            writer.write(orderString);
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error Writing To File");
        }
    }

    private static boolean createNewFile(String fileName) {
        File newFile = new File(fileName);
        File parentDirectory = new File(newFile.getParent());

        if (!parentDirectory.exists()) {
            if (!parentDirectory.mkdirs()) {
                System.out.println("Error: Could not create directory " + parentDirectory.getAbsolutePath());
                return false;
            }
        }

        try {
            System.out.println("\nFile '" + fileName + "' " + (newFile.createNewFile() ? "Successfully Created" : "Already Exists"));
            return true;
        } catch (IOException ex) {
            System.out.println("Error Creating File " + fileName);
            return false;
        }
    }

    private static String generateFileName() {
        return filePath + getCurrentDate() + ".txt";
    }

    private static String getCurrentDate() {
        return LocalDateTime.now().format(dateFormat);
    }
}
