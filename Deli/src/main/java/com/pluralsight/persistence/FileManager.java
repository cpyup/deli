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

    private FileManager(){} // Private constructor for static class

    public static void saveReceipt(String orderString) {
        String newFilePath = generateFileName();

        // Create receipt file
        if (!createNewFile(newFilePath)) {
            System.out.println("Error Creating File");
            return;
        }

        // Write to receipt file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath))) {
            writer.write(orderString.trim());
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error Writing To File");
        }
    }

    private static boolean createNewFile(String fileName) {
        File newFile = new File(fileName);
        File parentDirectory = new File(newFile.getParent());

        // Ensure directory exists before trying file creation
        if (!parentDirectory.exists()) {
            if (!parentDirectory.mkdirs()) {
                System.out.println("Error: Could not create directory " + parentDirectory.getAbsolutePath());
                return false;
            }
        }

        // Trying file creation
        try {
            System.out.println("File '" + fileName + "' " + (newFile.createNewFile() ? "Successfully Created" : "Already Exists"));
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
